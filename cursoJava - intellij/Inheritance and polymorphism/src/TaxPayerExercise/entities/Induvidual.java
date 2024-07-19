package TaxPayerExercise.entities;

public class Induvidual extends TaxPayer{

    // atributos
    private Double healthExpenditures;      // dispesas de saúde

    // construtores
    public Induvidual(){
        super();
    }

    public Induvidual(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    // get e set
    public Double getHealthExpenditures(){
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures){
        this.healthExpenditures = healthExpenditures;
    }

    // métodos

    // implementação do método abstrato tax da super classe TaxPayer
    @Override
    public Double tax(){
        // se a renda anual for menor que 20k, imposto é 15%, senão será 25%
        Double tax = getAnualIncome() < 20000.0? getAnualIncome() * 0.15: getAnualIncome() * 0.25;
        // abatendo 50% dos gastos com saúde do imposto
        tax -= healthExpenditures * 0.5;
        return tax;
    }
}
