package classComparable.application;

import classComparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        // lista de funcionários
        List<Employee> employeeList = new ArrayList<>();

        // guardando caminho do arquivo a ser lido
        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            // variável para guardar a linha atual do arquivo
            String currentLine = br.readLine();

            // enquanto existir uma próxima linha
            while (currentLine != null){
                // pega os elementos da linha (nome, slário) e guarda em um vetor
                String[] vectorLine = currentLine.split(",");
                // adiciona na lista um novo funcionário com nome e salário da linha atual
                employeeList.add(new Employee(vectorLine[0], Double.parseDouble(vectorLine[1])));
                // passa para a próxima linha
                currentLine = br.readLine();
            }

            // ordenando a lista de employees na ordem alfabética de seus nomes
            Collections.sort(employeeList);

            // imprimindo a lista de funcionários ordenados
            for (Employee e : employeeList){
                System.out.println(e.getName() + ", " + e.getSalary());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
