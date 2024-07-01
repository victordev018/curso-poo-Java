package accountExercise.model.entities;

// classe que representa a conta do tipo corrente
public class CurrentAccount implements Account{


    // atributos
    private String number;      // numero da conta
    private Double balance;     // saldo da conta
    private Double limit;       // limite

    // construtores
    public CurrentAccount(){
    }

    public CurrentAccount(String number, Double balance, double limit){
        this.number = number;
        this.balance = balance;
        this.limit = limit;
    }

    // get e set
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    // sobreposição do método que realiza um depósito
    @Override
    public void depossit(Double amount) {

    }
    // sobreposição do método que realiza saque
    @Override
    public void withDraw(Double amount) {

    }

    // sobreposição do método que realiza uma transferência
    @Override
    public void transfer(Account targetAccount, Double amount) {

    }

    // sobreposição do método que checa o saldo da conta
    @Override
    public double checkBalance() {
        return 0;
    }
}
