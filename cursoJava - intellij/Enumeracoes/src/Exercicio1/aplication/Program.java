package Exercicio1.aplication;

import Exercicio1.entities.Departament;
import Exercicio1.entities.HourContract;
import Exercicio1.entities.Worker;
import Exercicio1.entities.enums.WokerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

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

        // Perguntando a quantidade de contratos o trabalhador vai ter e preenchendo eles
        System.out.print("how many contracts to this worker? ");
        int n = in.nextInt();

        for (int c = 1; c <= n; c++) {
            System.out.println("Enter contract #"+c+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = format.parse(in.next());
            System.out.print("Value per hour: ");
            double valuePerHour = in.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = in.nextInt();

            // instanciando novo contrato
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

        }

        in.close();
    }

}
