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
            deposit(amount);
        }
    }
}
