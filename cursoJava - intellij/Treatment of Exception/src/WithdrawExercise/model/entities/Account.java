package WithdrawExercise.model.entities;

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
    public Double withdraw(Double amount){
        this.balance -= amount;
    }
}
