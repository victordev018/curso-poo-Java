package accountExercise.model.entities;

import accountExercise.model.exceptions.TransationException;

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
        // adiciona valor ao saldo da conta
        balance += amount;
    }
    // sobreposição do método que realiza saque
    @Override
    public void withDraw(Double amount) {
        // se o saldo for o suficiente
        if (amount <= balance){
            // retira o valor do saldo
            balance -= amount;
        }
        else{
            throw new TransationException("Insufficient funds");
        }
    }

    // sobreposição do método que realiza uma transferência
    @Override
    public void transfer(Account targetAccount, Double amount) {
        // verifica se o valor a ser transferido esta de acordo com o saldo da conta
        if (amount <= balance){
            // retira o valor da conta de origem
            balance -= amount;
            // deposita valor na conta destino
            targetAccount.depossit(amount);
        }
        else{
            throw new TransationException("insufficient funds");
        }
    }

    // sobreposição do método que checa o saldo da conta
    @Override
    public double checkBalance() {
        // retorna o valor do saldo
        return getBalance();
    }
}
