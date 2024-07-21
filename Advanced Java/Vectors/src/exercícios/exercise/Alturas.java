package exercícios;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/


import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = in.nextInt();

        // declarando vetores:
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        double somaAlturas = 0;

        for (int c = 0; c < n; c++){
            System.out.printf("Dados da %d° pessoa:%n ", c+1);
            in.nextLine();
            System.out.print("> Nome: ");
            nomes[c] = in.nextLine();
            System.out.print("> Idade: ");
            idades[c] = in.nextInt();
            System.out.print("> Altura: ");
            alturas[c] = in.nextDouble();
            somaAlturas += alturas[c];
        }

        double mediaAltura = somaAlturas / n;
        int menores_16 = 0;
        for (int c = 0; c < n; c++){
            if (idades[c] < 16){
                menores_16++;
            }
        }
        double percent_menor_16 = ((double  ) menores_16 / n) * 100.0;
        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent_menor_16);
        for (int c = 0; c < n; c++){
            if (idades[c] < 16){
                System.out.println(nomes[c]);
            }
        }

        in.close();
    }
}
