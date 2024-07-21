package exercícios;
import java.util.Locale;
import  java.util.Scanner;

public class mediaPares {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = in.nextInt();
        int[] vetor = new int[n];
        double sum = 0.0;
        int quantitiPar = 0;

        //preenchendo vetor:
        for (int c = 0; c < vetor.length; c++){
            System.out.printf("DIGITE O %d° VALOR: ", c+1);
            vetor[c] = in.nextInt();

            //se o valor for par:
            if (vetor[c] % 2 == 0){
                sum += vetor[c];
                quantitiPar++;
            }
        }

        double averagePar = sum/quantitiPar;

        if (quantitiPar > 0){
            System.out.printf("%nMEDIA DOS PARES: %.1f", averagePar);
        }
        else{
            System.out.printf("%nNENHUM NUMERO PAR!");
        }
        in.close();
    }

}
