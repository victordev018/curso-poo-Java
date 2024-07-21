package productExercise.application;

import productExercise.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // solicitando o caminho do arquivo
        System.out.print("> enter a full path file: ");
        String path = in.nextLine();

        // tente abrir o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // instanciando uma lista de produtos
            List<Product> list = new ArrayList<>();

            // lendo a linha atual do arquivo
            String currentLine = br.readLine();

            while (currentLine != null) {
                // quebra a linha atual em um vetor
                String[] fields = currentLine.split(",");
                // instancia um novo produto na lista
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                // atualiza a linha atual
                currentLine = br.readLine();
            }

            // instanciando um Comparator de nomes dos produtos por ordem alfabética
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            // calculando o preço médio dos produtos da lista
            double average = list.stream()      // cria um stream a partir de list
                    .map( p -> p.getPrice())    // cria um novo stream pegando os preços da cada produto
                    .reduce(0.0, (x, y) -> x + y) / list.size();    // realiza o somatório e divide pela quantidade

            //  criando uma lista com os nomes dos produtos que possui preço abaxo da média
            List<String> names = list.stream()
                    .filter( p -> p.getPrice() < average)
                    .map(p -> p.getName()).sorted(comp.reversed())
                    .collect(Collectors.toList());

            // imprimindo resultados
            System.out.println("> Average price: R$ " + String.format("%.2f", average));
            names.forEach(System.out::println);
        }
        catch (IOException e){
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
