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
            System.out.println("I'm BusinessAccount");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.uppdateBalance();
            System.out.println("I'm SavingsAccount!");
        }

        // experimentando o método withDraw nos dois tipos de classe

        // objeto do tipo Account, withDraw possue taxa de R$ 5.00
        Account account1 = new Account(123, "Pedro", 1000.0);
        account1.withDraw(200.0);
        System.out.println("Balance account one: R$" + account1.getBalance());

        // objeto do tipo SavingsAccount, withDraw não possue taxa
        Account account2 = new SavingsAccount(321, "Felipe", 1000.0, 0.01);
        account2.withDraw(200.0);
        System.out.println("Balance account two: R$" + account2.getBalance());

        // objeto do tipo BUsinessAccount, withDraw igual o da super (Account) + taxa de R$ 2.0
        Account account3 = new BusinessAccount(456, "Carlos", 1000.0, 200.0);
        account3.withDraw(200.0);
        System.out.println("Balance account three: R$" + account3.getBalance());

        // POLIMORFISMO - muitas formas, fazer com que variáveis do mesmo tipo tenham comportamentos diferentes
        // quando acionado seus métodos, isso por conta do tipo de Classe daquele objeto no momento da instanciação

        // instanciando objetos numa varíável do tipo Account, porém de instâncias diferentes
        Account a1 = new Account(546, "José", 100.0);
        Account a2 = new SavingsAccount(321, "Rick", 100.0, 0.01);

        // realizando saque para cada um dos objetos
        a1.withDraw(50.0);
        a2.withDraw(50.0);

        // exibindo valores de saldo dos objetos após a retirada
        System.out.println("Balance a1: R$"+a1.getBalance());
        System.out.println("Balance a2: R$"+a2.getBalance());
    }


}
