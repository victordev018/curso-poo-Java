package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i<n; i++ ){
            vect[i] = in.nextDouble();
        }

        double sum = 0.0;
        for (int i =0; i<n; i++){
            sum += vect[i];
        }

        double average = sum / n;

        System.out.println("Average Height: " + String.format("%.2f", average));

        in.close();
    }
}