package Exercicio1.aplication;

import Exercicio1.entities.Departament;
import Exercicio1.entities.Worker;
import Exercicio1.entities.enums.WokerLevel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // entrada de dados do trabalhador:
        System.out.print("Enter departament's name: ");
        String departamentName = in.nextLine();
        System.out.print("Enter worker data:");
        System.out.print("Name: ");
        String workerName = in.nextLine();
        System.out.print("Level: ");
        String workerLevel = in.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = in.nextDouble();

        // instanciando objtejo Worker com os dados lidos:
        Worker worker = new Worker(workerName,WokerLevel.valueOf(workerLevel) , baseSalary, new Departament(departamentName));

        in.close();
    }

}
