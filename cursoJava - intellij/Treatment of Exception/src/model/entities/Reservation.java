package model.entities;

import model.exceptions.DomainException;

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
        // se a data de sáida for antes da data de entrada, levantará uma exceção
        if (checkout.isBefore(checkin)){
            throw new DomainException("Check-out date must be after check-in date");
        }
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

        // verificando se a data é válida

        // se a data de entrada ou saída for anterior ao momento atual, levantara uma exceção
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        // se a data de sáida for antes da data de entrada, levantará uma exceção
        else if (checkout.isBefore(checkin)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
