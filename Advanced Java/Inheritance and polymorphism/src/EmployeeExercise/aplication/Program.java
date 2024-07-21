package EmployeeExercise.aplication;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import EmployeeExercise.entities.Employee;
import EmployeeExercise.entities.OutsourcedEmployee;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // lista de funcionários
        List<Employee> listEmployee = new ArrayList<Employee>();

        // funcionamento principal do programa
        System.out.print("Enter the number of employees: ");
        int numberEmp = in.nextInt();

        // inserindo os dados de N funcionários
        for (int i = 1; i <= numberEmp; i++){
            System.out.println("Employee #"+i+" data:");
            System.out.print("Outsourced (y/n)? ");
            char resp = in.next().charAt(0);

            // leitura de dados do funcionário
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Hours: ");
            int hours = in.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = in.nextDouble();

            // verificando se o funcionário é terceirizado
            if (resp == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = in.nextDouble();
                listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
            // se não for terceirizado
            listEmployee.add(new Employee(name, hours, valuePerHour));
            }
        }

        // percorrendo informações de pagamento de cada funcionário:
        System.out.println("\nPAYMENTS:");
        for (Employee emp: listEmployee){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }

}
