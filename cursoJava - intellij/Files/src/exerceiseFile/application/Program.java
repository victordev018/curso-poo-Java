package exerceiseFile.application;

import exerceiseFile.entities.Product;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // lista de produtos
        List<Product> listOfProducts = new ArrayList<>();

        // pedind caminho do arquvo .csv
        System.out.print("Enter a file .txt path: ");
        String filePath = in.nextLine();

        // criando um file com o caminho informado
        File file = new File(filePath);

        // tente abrir os arquvo do caminho passado
        try (BufferedReader br = new BufferedReader(new FileReader(file))){

            // string para pegar a linha atual do arquvo
            String line = br.readLine();

            // enquanto existir uma próxima linha no arquivo
            while (line != null){
                // vetor da linha atual, separando cada elemento por vírgula
                String[] currentLine = line.split(",");

                // instanciando um novo objeto produto com as informações da linha e gaudando na lista
                listOfProducts.add(new Product(currentLine));

                // indo para prixima linha
                line = br.readLine();
            }

            // criando um novo arquivo "summary.csv", no mesma pasta de origem e escrevendo nele

            // criando subpasta out na pasta de origem
            boolean succes = new File(file.getParent() + "\\out").mkdir();

            // novo caminho para criar arquivo
            String pathToNewFile = file.getParent() + "\\out\\summary.txt";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToNewFile))){
                // para cada objeto produto na minha lista de produtos
                for (Product p : listOfProducts){
                    // escrveva os objteos no novo arquivo
                    bw.write(p.toString());
                    // quebra a linha
                    bw.newLine();
                }
                System.out.println(pathToNewFile + " CREATED");
            }
            catch (IIOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
