package accountExercise.application;

import accountExercise.model.entities.Account;
import accountExercise.model.entities.Client;
import accountExercise.model.entities.CurrentAccount;
import accountExercise.model.entities.SavingsAccount;
import accountExercise.model.services.Transation;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        // instanciando um cliente
        Client client = new Client("João Victor", "111.222.333-44");

        // criando duas contas de tipos diferentes
        Account currentAccount = new CurrentAccount("1234-5", 100.0, 200.0);
        Account savingsAccount = new SavingsAccount("5432-1", 2000.0, 24.0 );

        // adicionando as duas contas ao cliente
        client.addNewAccount(currentAccount);
        client.addNewAccount(savingsAccount);

        // realizando operações nas contas
        currentAccount.depossit(400.0);
        currentAccount.withDraw(150.0);
        savingsAccount.transfer(currentAccount, 1000.0);

        // exibindo valores de saldos
        System.out.println("Balance in currentAccount: R$ " + String.format("%.2f", currentAccount.checkBalance()));
        System.out.println("Balance in savingsAccount: R$ " + String.format("%.2f", savingsAccount.checkBalance()));
        System.out.println("Total balance in accounts: R$ " + String.format("%.2f", client.checkTotalBalance()));

        // realizano uma nova transação
        Transation transation = new Transation("Deposit", 2800.0);
        transation.recordTransition();
    }
}
