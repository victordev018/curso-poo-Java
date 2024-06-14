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
    }

}
