package TaxPayerExercise.entities;

public abstract class TaxPayer {

    // atributos
    private String name;            // nome
    private Double anualIncome;     // rendimento anual

    // construtores
    public TaxPayer(){
    }

    public TaxPayer(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }

    // get e set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnualIncome() {
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    // métodos

    // declaração do método abstrato tax (imposto)
    public abstract Double tax();
}
