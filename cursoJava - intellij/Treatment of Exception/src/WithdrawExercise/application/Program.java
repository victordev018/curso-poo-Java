package WithdrawExercise.application;

import WithdrawExercise.model.entities.Account;
import WithdrawExercise.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // tente executar este bloco de código
        try {
            // funcionamento principal do programa

            // lendo dados da conta
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = in.nextInt();
            System.out.print("Holder: ");
            in.nextLine();
            String holder = in.nextLine();
            System.out.print("Initial balance: ");
            Double balance = in.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = in.nextDouble();

            // instanciando conta com os dados informados
            Account account = new Account(number, holder, balance, withdrawLimit);

            // Solicitando saque
            System.out.print("\nEnter amount for withdraw: ");
            account.withdraw(in.nextDouble());

            // exibindo novo saldo pós saque
            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        }
        // caso haja uma exeção, execute esta
        catch (WithdrawException e){
            System.out.print("Withdraw error: " + e.getMessage());
        }
        // independentemente se houve ou não exceção, execute isto
        finally {
            in.close();
        }
    }

}
