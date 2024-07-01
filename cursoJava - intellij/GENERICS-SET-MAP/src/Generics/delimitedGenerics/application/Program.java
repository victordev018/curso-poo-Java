package Generics.delimitedGenerics.application;

import Generics.delimitedGenerics.entities.Product;
import Generics.delimitedGenerics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        // lista de produtos
        List<Product> listOfProducts = new ArrayList<>();

        // pegando caminho do arquivo
        String path = "c:\\temp\\in.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            // variável para ler a linha atual do arquivo
            String currentLine = bf.readLine();

            while (currentLine != null){
                // gaudando no vetor os dois elementos da linha separados por uma vírgula
                String[] fields = currentLine.split(",");
                // instanciando um objeto produto com os dados da linha e guarando na lista
                listOfProducts.add(new Product(fields[0], Double.parseDouble(fields[1])));
                // atualiza a linha atual para a próxima linha
                currentLine = bf.readLine();
            }

            Product x = CalculationService.max(listOfProducts);
            System.out.println("Most expensive: ");
            System.out.println(x);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
