package Aplication;

import java.util.Scanner;
import util.Mat;

public class ProgramRaizQuadrada {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        double number = in.nextDouble();
        System.out.printf("Raiz: %.0f", Mat.Raiz(number));

        in.close();
    }
}
