package ExerciseAccount.aplication;

import ExerciseAccount.entities.BusinessAccount;

import java.util.Locale;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        // instanciando um objeto conta do tipo BUsinessAccount
        BusinessAccount account = new BusinessAccount(1000, "João Victor",
                2000.0, 5000.00);

        System.out.format("Holder: %s, Balance: $%.2f", account.getHolder(), account.getBalance());

    }

}
