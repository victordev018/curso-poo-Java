package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Quqantos números você vai digitar? ");
        int nValue = in.nextInt();
        double[] vectValue = new double[nValue];
        double sum = 0;

        for (int c = 0; c < vectValue.length; c++){
            System.out.printf("Digite o %d° valor: ", c+1);
            vectValue[c] = in.nextDouble();
            sum += vectValue[c];
        }

        System.out.print("VALORES: ");

        for (int c = 0; c<vectValue.length; c++){
            System.out.printf("%.1f ", vectValue[c]);
        }

        double average = sum / nValue;
        System.out.println("\nSOMA = "+ String.format("%.2f", sum));
        System.out.println("MEDIA = "+ String.format("%.2f", average));

        in.close();
    }

}
