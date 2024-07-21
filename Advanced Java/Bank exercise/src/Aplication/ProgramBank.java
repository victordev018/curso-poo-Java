package Aplication;

import entitie.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        BankAccount bank;

        System.out.print("Enter account number: ");
        int numberAccount = in.nextInt();
        System.out.print("Enter account holder: ");
        in.nextLine();
        String holderAccount = in.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = in.next().charAt(0);

        double deposit;
        if (resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            deposit = in.nextDouble();
            bank = new BankAccount(numberAccount,holderAccount,deposit);
        }else {
            bank = new BankAccount(numberAccount, holderAccount);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank.toString());

        System.out.print("\nEnter a deposit value: ");
        deposit = in.nextDouble();
        bank.NewDeposit(deposit);
        System.out.println("\nUppdate account data: ");
        System.out.println(bank.toString());

        System.out.print("\nEnter a withdraw value: ");
        double loot = in.nextDouble();
        bank.NewLoot(loot);
        System.out.println("\nUppdate account data: ");
        System.out.println(bank.toString());

        in.close();
    }
}