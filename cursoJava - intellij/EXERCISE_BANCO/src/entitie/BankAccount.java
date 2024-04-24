package entitie;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankAccount(){
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        NewDeposit(initialDeposit);
    }

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String toString(){
        return "Account "
              + getAccountNumber()
              + ", Holder: "
              + getAccountHolder()
              + ", Balance: $ "
              + String.format("%.2f", getAccountBalance());
    }

    //metodo para novos depositos
    public void NewDeposit(double accountDeposit){
        this.accountBalance += accountDeposit;
    }

    //metodo para saques
    public void NewLoot(double accountDeposit){
            this.accountBalance -= accountDeposit+5;
    }

}
