package Aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = in.nextLine();

        System.out.print("Gloss salary: ");
        employee.GlossSalary = in.nextDouble();

        System.out.print("Tax: ");
        employee.Tax = in.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary: ");
        double percent = in.nextDouble();
        employee.IncreaseSalary(percent);

        System.out.print("Uppdade data: " + employee);
        
        in.close();
    }
}
