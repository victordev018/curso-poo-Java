package rentCarExercise.model.entities;

// classe referente a fatura
public class Invoice {

    // atributos
    private Double basicPayment;    // pagamento basico
    private Double tax;             // imposto

    // construtor
    public Invoice(){
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    // get e set
    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    // métodos

    // método para pegar o pagamento total
    public Double getTotalPayment(){
        return getBasicPayment() + getTax();
    }
}
