package Aplication;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        retangulo.width = in.nextDouble();
        retangulo.height = in.nextDouble();

        String result = "AREA = " + String.format("%.2f%n", retangulo.Area())
                        +"PERIMETER = " + String.format("%.2f%n", retangulo.Perimeter())
                        +"DIAGONAL = " + String.format("%.2f%n", retangulo.Diagonal() );

        System.out.println(result);
        in.close();
    }
}