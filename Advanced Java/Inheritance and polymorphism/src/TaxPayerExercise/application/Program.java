package TaxPayerExercise.application;

import TaxPayerExercise.entities.Company;
import TaxPayerExercise.entities.Induvidual;
import TaxPayerExercise.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // declaração da lista de TaxPauyer
        List<TaxPayer> listOfTaxPayer = new ArrayList<TaxPayer>();

        // funcionamento principal do programa
        System.out.print("Enter the number of the tax payer: ");
        int numTaxPayers =  in.nextInt();

        // inserindo dados de cada um dos contribuintes
        for (int i = 1; i <= numTaxPayers; i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or Company (i/c)? ");
            char typeTaxPayer = in.next().charAt(0);

            // leitura de dados do atual contribuinte
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = in.nextDouble();

            // verificando tipo de contribuinte:
            if (typeTaxPayer == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = in.nextDouble();

                // instanciando na lista de TaxPayer um contribuinte Individual
                listOfTaxPayer.add(new Induvidual(name, anualIncome, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = in.nextInt();

                // instanciando na lista de TaxPayer um contribuinte Comapany
                listOfTaxPayer.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        // exibição de dados sobre o imposto de cada um dos contribuintes da lista
        System.out.println("\nTAXES PAYD");
        Double totalTaxPayer = 0.0;

        // percorrendo a lista de contribuintes e pegando o imposto de cada um deles
        for (TaxPayer taxPayer: listOfTaxPayer){
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
            totalTaxPayer += taxPayer.tax();
        }

        // exibindo o  somatório de impostos
        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxPayer));

        in.close();
    }

}
