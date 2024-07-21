package exercicios_sequenciação_de_dados;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a+b;
		
		System.out.println("SOMA: "+soma);
		
		sc.close();
	}

}