package exercícios;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
import java.util.Scanner;

public class SomarDoisVetores {

   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Quantos números irá digitar em cada vetor? ");
       int n = in.nextInt();
       int[] vetorA = new int[n];
       int[] vetorB = new int[n];
       int[] vetorC = new int[n];

       //preencendo vetores A e B
       System.out.println("Digite os valores do vetor A: ");
       for (int e = 0; e < n; e++){
           vetorA[e] = in.nextInt();
       }

       System.out.println("Digite os valores do vetor B: ");
       for (int e = 0; e < n; e++){
           vetorB[e] = in.nextInt();
       }

       //Somando valores de vetores A e B e armazenando no vetor C
       for (int e = 0; e < n; e++){
           vetorC[e] = vetorA[e] + vetorB[e] ;
       }

       // vetor resultante:
       System.out.println("VETOR RESULTANTE:");
       for (int e = 0; e < n; e++){
           System.out.println(vetorC[e]);
       }

       in.close();
   }

}
