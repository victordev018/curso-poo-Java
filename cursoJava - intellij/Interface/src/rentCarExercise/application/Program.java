package rentCarExercise.application;

import rentCarExercise.model.entities.CarRental;
import rentCarExercise.model.entities.Vehicle;
import rentCarExercise.model.services.BrazilTaxService;
import rentCarExercise.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // formato para entrada de data e hora
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // lendo os dados para fazer o aluguel do carro
        System.out.println("Enter with data of the rent:");
        System.out.print("Car model: ");
        String carModel = in.nextLine();
        System.out.print("Withdraw (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(in.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(in.nextLine(), fmt);
        System.out.print("Enter with price per hour: ");
        double pricePerHour = in.nextDouble();
        System.out.print("Enter with price per day: ");
        double pricePerDay = in.nextDouble();

        // instanciando servico de alugeul com os dados passados
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        // instanciando um aluguel de carro com os dados informados
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        // executando processo de fatura a partir do alguel de carro instaciado
        rentalService.processInvoice(cr);

        // exibindo dados da fatura
        System.out.println("\nFATURA");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f",cr.getInvoice().getTotalPayment()));

        in.close();
    }
}
