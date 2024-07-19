package Exercise1.aplication;

import Exercise1.entities.Departament;
import Exercise1.entities.HourContract;
import Exercise1.entities.Worker;
import Exercise1.entities.enums.WokerLevel;

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
        System.out.println("Enter worker data:");
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
            worker.addContract(contract);

        }

        // calculando o salário do trabalhador em um dado mês
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monhtAndYear = in.next();
        int month = Integer.parseInt(monhtAndYear.substring(0, 2));
        int year = Integer.parseInt(monhtAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monhtAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        in.close();
    }

}
