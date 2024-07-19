package TaxPayerExercise.entities;

public class Company extends TaxPayer{

    // atributos
    private Integer numberOfEmpoyees;   // número de funcionários

    // construtores
    public Company(){
        super();
    }

    public Company (String name, Double anualIncome, Integer numberOfEmpoyees){
        super(name, anualIncome);
        this.numberOfEmpoyees = numberOfEmpoyees;
    }

    // get e set
    public Integer getNumberOfEmpoyees(){
        return numberOfEmpoyees;
    }

    public void setNumberOfEmpoyees(int numberOfEmpoyees){
        this.numberOfEmpoyees = numberOfEmpoyees;
    }

    // métodos

    // implementação do método abstrato tax da super classe TaxPayer
    @Override
    public Double tax(){
        // se a empresa contiver mais de 10 funcionários, imposto é de 14%, senão será de 16%
        return numberOfEmpoyees > 10? getAnualIncome() * 0.14: getAnualIncome() * 0.16;
    }
}
