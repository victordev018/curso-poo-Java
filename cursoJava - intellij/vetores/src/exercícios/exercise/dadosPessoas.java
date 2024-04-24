package exercícios;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = in.nextInt();
        double[] Alturas = new double[n];
        char[] Genero = new char[n];
        double maior, menor, mediaAlturaMulher;
        int numeroHomens, numeroMulhers;

        for (int c = 0; c < n; c++){
            System.out.printf("Altura da %da pessoa: ", c+1);
            Alturas[c] =  in.nextDouble();
            System.out.printf("Genero da %da pessoa: ", c+1);
            Genero[c] = in.next().charAt(0);
        }
        maior = Alturas[0];
        menor = Alturas[0];
        mediaAlturaMulher = 0;
        numeroMulhers = 0;
        numeroHomens = 0;

        for (int c = 0; c < Alturas.length; c++){
            //pegando maior altura:
            if (Alturas[c] > maior){
                maior = Alturas[c];
            }
            //pegando menor altura:
            if (Alturas[c] < menor){
                menor = Alturas[c];
            }
            // media alturas das mulheres:
            if (Genero[c] == 'F'){
                mediaAlturaMulher += Alturas[c];
                numeroMulhers++;
            }
            //numero de homens:
            if (Genero[c] == 'M') {
                numeroHomens++;
            }
        }

        mediaAlturaMulher /= numeroMulhers;
        System.out.printf("%nMenor altura: %.2f", menor);
        System.out.printf("%nMaior altura: %.2f", maior);
        System.out.printf("%nMédia das alturas das mulheres: %.2f", mediaAlturaMulher);
        System.out.printf("%nNumero de Homens: %d", numeroHomens);

        in.close();
    }

}
