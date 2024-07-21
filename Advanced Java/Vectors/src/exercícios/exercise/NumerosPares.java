package exercícios;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int nElements = in.nextInt();
        int[] vercNumbers = new int[nElements];

        for (int c = 0; c < vercNumbers.length; c++){
            System.out.printf("Digite o %d° número: ", c+1 );
            vercNumbers[c] = in.nextInt();
        }
        int quantidadePares = 0;
        System.out.println("\nNUMEROS PARES: ");
        for (int c = 0; c < vercNumbers.length; c++){
            if (vercNumbers[c] % 2 == 0){
                System.out.print(" "+ vercNumbers[c]);
                quantidadePares++;
            }
        }
        System.out.print("\nQUANTIDADE DE PARES = " + quantidadePares);

    }

}
