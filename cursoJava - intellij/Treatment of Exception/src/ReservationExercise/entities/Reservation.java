package ReservationExercise.entities;

import java.time.Duration;
import java.time.LocalDate;

public class Reservation {

    // atributos
    private Integer roomNumber;        // n° do quarto
    private LocalDate checkin;         // data de entrada
    private LocalDate checkout;        // data de saída

    // construtores:
    public Reservation(){
    }

    public Reservation (int roomNumber, LocalDate checkin, LocalDate checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // get e set
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public LocalDate getCheckin() {
        return checkin;
    }
    public LocalDate getCheckout() {
        return checkout;
    }

    // métodos

    // método que retorna a duração em dias das datas de entrada e saída
    public long duration(){
        Duration duration = Duration.between(checkin, checkout);
        return duration.toDays();
    }

    // método que realiza as atualizções de datas de entrada e saída
    public void updateDates(LocalDate checkin, LocalDate checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
