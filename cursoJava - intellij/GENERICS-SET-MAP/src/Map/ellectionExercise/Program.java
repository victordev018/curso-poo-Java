package Map.ellectionExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter full path file: ");
        String path = in.nextLine();

        // tente abrir o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // instanciando uma novo Map com key do tipo String(nome do candidato) e value do tipo Integer (qunatidade de votos)
            Map<String, Integer> votes = new LinkedHashMap<>();

            // variável para a linha atual do arquivo
            String currentLine = br.readLine();

            while (currentLine != null){

                // instancia um vetor com os elementos da linha
                String[] elements = currentLine.split(",");
                String candidate = elements[0];
                Integer quantityVotes = Integer.parseInt(elements[1]);

                // se o eleitor desta linha ja existir como uma chave
                if (votes.containsKey(candidate)){
                    // some a quantidade de votos que ele ja possue com a nova quantidade
                    votes.put(candidate, votes.get(candidate) + quantityVotes);
                }
                else{
                    votes.put(candidate, quantityVotes);
                }

                // atualiza a linha atual
                currentLine = br.readLine();
            }

            // exibindo quantidade de votos total associado a cada candidato
            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }
        }
        catch (IOException e){
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
