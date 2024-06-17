package WithdrawExercise.model.entities;
import WithdrawExercise.model.exceptions.WithdrawException;

public class Account {

    // atributos
    private Integer number;         // numero da conta
    private String holder;          // titular
    private Double balance;         // saldo
    private Double withdrawLimit;   // limite de saque

    // construtores
    public Account(){
    }

    public Account (Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // get e set
    public Integer getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // métodos

    // método para realizar depósito da conta
    public void deposit (Double amoount){
        this.balance += amoount;
    }

    // método para efetuar saque
    public void withdraw(Double amount){
        // se a quantia de saque for maior que o limite de saque, será lançada uma exceção
        if (amount > withdrawLimit){
            throw new WithdrawException("The amount exceeds withdraw limit");
        }
        // se não houver saldo na conta, será lançada uma exceção
        if (balance <= 0.0){
            throw new WithdrawException("Not enough balance");
        }
        this.balance -= amount;
    }
}
