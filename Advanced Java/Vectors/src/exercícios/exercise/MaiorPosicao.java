package exercícios;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos númeoros você vai ler? ");
        int n = in.nextInt();
        double[] listaNumeros = new double[n];

        for (int c = 0; c < n; c++){
            System.out.print("Digite um número: ");
            listaNumeros[c] = in.nextDouble();
        }

        double maiorNumero = listaNumeros[0];
        int posicao = 0;
        for (int c = 0; c < n; c++){
            if (listaNumeros[c] >= maiorNumero){
                maiorNumero = listaNumeros[c];
                posicao = c;
            }
        }
    System.out.println();
    System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);
    System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicao);
    }
}
