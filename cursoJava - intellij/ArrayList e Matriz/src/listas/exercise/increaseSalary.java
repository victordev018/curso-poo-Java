package listas.exercise;

//importações
import listas.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class increaseSalary {

    public static  void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // Array que quardará os funcionários:
        List<Employee> employeeList = new ArrayList<>();

        // Quantos funcionários serão resgistrados:
        System.out.print("how many employees will be registered? ");
        int N = in.nextInt();

        for (int c = 0; c < N; c++){

            // coletando dados dos funcionários
            System.out.println("\nEMPLOYEE #"+ (c+1) + ":");
            System.out.print("Id: ");
            int Id = in.nextInt();
            // validandação de que o id não pode ser repetido:
            while (hasId(employeeList, Id)){
                System.out.print("Id already  taken! Try again: "); // este id existe, tente novamente
                Id = in.nextInt();
            }
            System.out.print("Name: ");
            in.nextLine();
            String Name = in.nextLine();
            System.out.print("Salary: ");
            Double Salary = in.nextDouble();

            // construindo um objeto do tipo employee com os dados e guardando em uma lista:
            employeeList.add(new Employee(Id, Name, Salary));

        }
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idEmp = in.nextInt();

        // verificar se o Id existe, filtrando com predicado:
        //Employee idSalEncriase = employeeList.stream().filter(x -> x.getId() == idEmp).findFirst().orElse(null);
        Integer idSalEncriase = idPosition(employeeList, idEmp);

        if (idSalEncriase == null){
            System.out.println("Sorry, this id not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            Double percent = in.nextDouble();
            employeeList.get(idSalEncriase).increaseSalary(percent);
        }

        //Exibir Ids, funcionários e Salários:
        System.out.println("\nList of Employees:");
        for(Employee emp: employeeList){
            System.out.println(emp);
        }

        in.close();
    }

    // função que verifica se existe determindado id na lista e devolve a posição
    public static Integer idPosition(List<Employee> lista, int id){
        // percorrer lista para verificar se existe aquele id, e retornara posição, caso tenha
        for (int e = 0; e < lista.size(); e++){
            if (lista.get(e).getId() == id){
                return e;
            }
        }
        return null;
    }

    // função que verifica já existe determinado Id:
    public static Boolean hasId(List<Employee> lista, int id){
        Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;  // se for encontrado ele retorna true
    }

}
