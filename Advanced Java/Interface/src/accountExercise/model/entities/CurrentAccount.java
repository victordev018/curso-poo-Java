package accountExercise.model.entities;

import accountExercise.model.exceptions.TransationException;

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
        // acrescenta valor no saldo
        this.balance += amount;
    }
    // sobreposição do método que realiza saque
    @Override
    public void withDraw(Double amount) {
        // se o valor for menor ou igual ao saldo e se estiver dentro do limite
        if (amount <= balance && amount <= limit){
            // retira o valor do saldo
            balance -= amount;
        }
        else{
            throw new TransationException("insufficient funds");
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
