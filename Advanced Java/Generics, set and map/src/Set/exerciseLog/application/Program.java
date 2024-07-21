package Set.exerciseLog.application;

import Set.exerciseLog.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = in.nextLine();

        // tentando abrir o arquivo com o try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            // criando um novo HashSet de LogEntry
            Set<LogEntry> entrySet = new HashSet<>();

            // variável para pegar a linha do arquivo
            String currentLine = br.readLine();

            while (currentLine != null){

                // cria um vetor com os elementos da linha atual
                String[] fields = currentLine.split(" ");
                String userName = fields[0];
                LocalDateTime moment = LocalDateTime.parse(fields[1], DateTimeFormatter.ISO_DATE_TIME);

                // guardando no set uma instância de um objeto LogEntry com os dados da linha
                entrySet.add(new LogEntry(userName, moment));

                // lê próxima linha do arquivo
                currentLine = br.readLine();
            }

            // exibindo a quantidade total de usuário únicos que acessaram
            System.out.println("Total users: " + entrySet.size());
        }
        catch (IOException e){
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
