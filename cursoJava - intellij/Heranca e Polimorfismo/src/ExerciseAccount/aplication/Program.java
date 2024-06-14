package ExerciseAccount.aplication;

import ExerciseAccount.entities.Account;
import ExerciseAccount.entities.BusinessAccount;
import ExerciseAccount.entities.SavingsAccount;

import java.util.Locale;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        // Instanciando objetos do tipo Account e BusinessAccount
        Account acc = new Account(1001, "João", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 200.0);

        // UPCASTING
        // podemos fazer o casting de uma subclass para uma variável da superclasse dela

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Mario", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Caio", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // a linha abaico levantará uma exception ClassCastException, pois não é possivel converter uma SavingsAccount
        // para BusinessAccount, logo é ideal fazer uma verificação
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.print("I'm BusinessAccount");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.uppdateBalance();
            System.out.print("I'm SavingsAccount!");
        }
    }


}
