package rentCarExercise.application;

import rentCarExercise.model.entities.CarRental;
import rentCarExercise.model.entities.Vehicle;

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

        // instanciando um aluguel de carro com os dados informados
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        in.close();
    }
}
