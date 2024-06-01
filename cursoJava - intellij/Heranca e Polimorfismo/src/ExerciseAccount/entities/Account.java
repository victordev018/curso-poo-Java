package ExerciseAccount.entities;

public class Account {

    // atributos
    private Integer number;
    private String holder;
    protected Double balance;

    // construtores
    public Account(){
    }

    public Account (Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
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

    // métodos

    // método para fazer um saque
    public void withDraw(Double amount){
        this.balance -= amount;
    }

    // método para realizar um depósito
    public void deposit(Double amount){
        this.balance += amount;
    }
}
