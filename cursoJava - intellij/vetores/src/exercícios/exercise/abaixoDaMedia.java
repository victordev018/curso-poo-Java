package exercícios;

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos números irá ler? ");
        int n = in.nextInt();
        double[] vetor = new double[n];
        double sum = 0.0;
        for (int c = 0; c < n; c++){
            System.out.printf("DIGITE O %d° NÚMERO: ", c+1);
            vetor[c] = in.nextDouble();
            sum += vetor[c];
        }
        double average = sum/n;
        System.out.printf("%nMEDIA DOS VETOR: %.3f%n",average);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int c = 0; c < vetor.length;c++){
            if (vetor[c] < average){
                System.out.println(vetor[c]);
            }
        }

        in.close();
    }

}
