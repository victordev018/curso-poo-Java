package exercicios_sequenciação_de_dados;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D.
		   A seguir, calcule e mostre a diferença do produto
		   de A e B pelo produto de C e D segundo a fórmula: 
		   DIFERENCA = (A * B - C * D).*/
		Scanner sc = new Scanner(System.in);
		
		int A, B, C , D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = (A*B)-(C*D);
		
		System.out.println("Diferenca de produtos: "+ dif);
		sc.close();
	}

}
