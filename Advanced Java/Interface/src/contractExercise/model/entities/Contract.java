package contractExercise.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// classe referente ao Contrato
public class Contract {

    // atributos
    private Integer number;     // n° do contrato
    private LocalDate date;     // data do contrato
    private Double totalValue;  // valor total do contrato

    // o contrato é composto por uma ou várias parcelas
    List<Installment> installments = new ArrayList<>();

    // construtor
    public Contract(){
    }

    public Contract(int number, LocalDate date, Double totalValue){
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    // get e set
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
