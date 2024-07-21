package salaryExercise.application;

import salaryExercise.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // entrada de dados do usuário
        System.out.print("> Enter full path file: ");
        String path = in.nextLine();
        System.out.print("> Enter salary: ");
        double salary = in.nextDouble();

        // tente abrir o arquivo do caminho informado
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // instanciar uma lista de funcionários
            List<Employee> list = new ArrayList<>();

            // pegando linha atual do arquivo
            String currentLine = br.readLine();

            while (currentLine != null){

                // quebra a linha atual em um vetor com as 3 informações (nome, email e salário) separadas
                String[] _fields = currentLine.split(",");
                String _name = _fields[0];
                String _email = _fields[1];
                Double _salary = Double.parseDouble(_fields[2]);

                // instanciando um funcionário na lista com as informações atuais
                list.add(new Employee(_name, _email, _salary));

                // atualiza a linha atual
                currentLine = br.readLine();
            }

            // instanciando um comparator de para organizar Strings em ordem alfabética
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            // criando uma lista de emails dos funcionário que tem salário maior que o salary informado pelo usuário
            List<String> emails = list.stream()     // cria um stream a partir da lista
                    .filter(e -> e.getSalary() > salary) // novo stream com funcionário que possui salário maior que informado
                    .map(e -> e.getEmail()).sorted(comp) // stream de emails destes funcionários filtrados em ordem alfabética
                    .collect(Collectors.toList());      // convertendo o stream para List

            // soma dos salários dos funcionários cujo nome começa com a letra 'M'
            double sum = list.stream()      // cria um stream a partir da lista de funcionários
                    .filter(e -> e.getName().charAt(0) == 'M')  // stream de funcionários que tenham nome de inicial 'M'
                    .map(e -> e.getSalary())    // stream de salário destes funcionários filtrados
                    .reduce(0.0, (x, y) -> x + y);  // somatório dos saçários

            // saida de dados
            System.out.println("Email of people whose salary is more than " + salary);
            emails.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name started with 'M' : " + String.format("%.2f", sum));
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
