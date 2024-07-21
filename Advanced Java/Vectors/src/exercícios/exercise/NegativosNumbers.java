package exercícios;

import java.util.Scanner;

public class NegativosNumbers {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Quanros números você vai digitar? ");
        int nElements = in.nextInt();
        int[] vectNumber = new int[nElements];

        for (int c = 0; c < vectNumber.length; c++){
            System.out.printf("Digite o %d° valor: ", c+1);
            vectNumber[c] = in.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int c = 0; c < vectNumber.length; c++){
            if(vectNumber[c] < 0){
                System.out.println(vectNumber[c]);
            }
        }

        in.close();
    }

}
