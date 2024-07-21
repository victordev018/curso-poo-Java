package exercicios_sequenciação_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B , C, area_triangulo, pi, area_curculo, area_trapezio, area_quadrado, area_retangulo;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		area_triangulo = (A*C)/2;
		pi = 3.14159;
		area_curculo = pi * Math.pow(C , 2);
		area_trapezio = (A+B)/2 * C;
		area_quadrado = B * B;
		area_retangulo = A * B;
		
		
		
		
		System.out.printf("TRIANGULO: %.3f%n", area_triangulo);
		System.out.printf("CIRCULO: %.3f%n", area_curculo);	
		System.out.printf("TRAPEZIO: %.3f%n" , area_trapezio);
		System.out.printf("QUADRADO: %.3f%n" , area_quadrado);
		System.out.printf("RETANGULO: %.3f%n" , area_retangulo);
		
		
				
		sc.close();

	}

}
