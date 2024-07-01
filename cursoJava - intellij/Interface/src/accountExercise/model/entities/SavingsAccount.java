package accountExercise.model.entities;

// classe que representa a conta do tupo poupança
public class SavingsAccount implements Account{

    // atributos
    private String number;      // numero da conta
    private Double balance;     // saldo da conta
    private Double interestRate;// taxa de juros

    // construtores
    public SavingsAccount(){
    }

    public SavingsAccount(String number, Double balance, Double interestRate) {
        this.number = number;
        this.balance = balance;
        this.interestRate = interestRate;
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

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
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
