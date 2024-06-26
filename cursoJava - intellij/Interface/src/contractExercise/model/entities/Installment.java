package contractExercise.model.entities;

import java.time.LocalDate;

// classe referente as Parcelas
public class Installment {

    // atributos
    private LocalDate date;     // data da parcela
    private Double amount;      // valor da parcela

    // construtor
    public Installment(){
    }

    public Installment(LocalDate date, Double amount){
        this.date = date;
        this.amount = amount;
    }

    // get e set
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
