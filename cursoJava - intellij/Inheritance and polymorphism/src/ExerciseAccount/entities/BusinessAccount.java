package ExerciseAccount.entities;

public class BusinessAccount extends Account{

    // atributos
    private Double loanLimit;

    // construtor
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // get e set
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // método empréstimo
    public void loan(Double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

    // criando uma sobreposição de método  withdrw da super classe, fazendo com que nesse tipo de conta
    // seja realizada a withDraw da super classe e implemente uma texa a mais de R$ 2.0

    @Override
    public void withDraw(Double amount){
        super.withDraw(amount);
        balance -= 2.0;
    }
}
