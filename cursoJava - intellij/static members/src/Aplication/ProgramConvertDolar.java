package Aplication;

import util.CurrencyConvert;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConvertDolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceDollar = in.nextDouble();

        System.out.print("how many dollars will be bought? ");
        double quantityDollars = in.nextDouble();
        double result = CurrencyConvert.Convert(quantityDollars, priceDollar);
        System.out.printf("Amount to be paid in reais = %.2f%n",result);

        in.close();
    }
}