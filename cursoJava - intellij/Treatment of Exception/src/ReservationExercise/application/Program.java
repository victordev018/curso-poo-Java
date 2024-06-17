package ReservationExercise.application;
import ReservationExercise.model.entities.Reservation;
import ReservationExercise.model.exceptions.DomainException;
import data_hora.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // formato de data (dd/MM/yyyy)
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            // funcionamento principal do programa

            // solicitando os dados de reserva para um quarto
            System.out.print("Room number: ");
            int roomNumber = in.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkin = LocalDate.parse(in.next(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkout = LocalDate.parse(in.next(), fmt);

            // instanciando um objeto da classe Reservation
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);

            // exibindo informações sobre a reserva:
            System.out.println(reservation);

            // coletando datas para a atualização de reserva
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = LocalDate.parse(in.next(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = LocalDate.parse(in.next(), fmt);

            // fazendo a atualização da reserva:
            reservation.updateDates(checkin, checkout);

            // exibindo informações sobre a reserva:
            System.out.println(reservation);

        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        in.close();
    }

}
