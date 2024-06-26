package contractExercise.application;

import contractExercise.model.entities.Contract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // formato de entrada de datas
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter with contract datas:");
        System.out.print("Number: ");
        int number = in.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(in.next(), fmt);
        System.out.print("Contrat value: ");
        Double totalValue = in.nextDouble();
        System.out.print("Enter the number of installments: ");
        int numberInstallments = in.nextInt();

        // instanciando novo contrato
        Contract contract = new Contract(number, date, totalValue);

        in.close();
    }
}
