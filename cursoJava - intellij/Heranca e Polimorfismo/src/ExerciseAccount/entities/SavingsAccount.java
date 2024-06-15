package ExerciseAccount.entities;

// a palavra final indica que a classe não pode ser herdada
public final class SavingsAccount extends Account {

    // atributos
    private Double interestRate;    // taxa de juros

    // construtores
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    // get e set
    public Double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(Double interestRate){
        this.interestRate = interestRate;
    }

    // métodos

    // atualizando saldo da conta, adicionando o valor com juros aplicado
    public void uppdateBalance(){
        balance += balance * interestRate;
    }

    // criando uma sobreposição de método  withdrw da super classe, fazendo com que nesse tipo de conta
    // não seja descontado a taxa

    @Override   // a notação Override indica que o método abaixo é uma sobreposição da super classe
    public final void withDraw(Double amount){  // final indica que o meétodo não pode ser sobreposto
        balance -= amount;
    }
}
