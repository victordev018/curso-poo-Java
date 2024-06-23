package rentCarExercise.model.entities;

import java.time.LocalDateTime;

// classe referente ao aluguel de carro
public class CarRenter {

    // atributos
    private LocalDateTime start;    // hora de inicio
    private LocalDateTime finish;   // hora de final

    // associações
    private Vehicle vehicle;    // veículo
    private Invoice invoice;    // fatura

    // construtor
    public CarRenter(){
    }

    public CarRenter(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, Invoice invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    // get e set

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
