package exercicios_sequenciação_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1,
		 o número de peçaxjs 1, o valor unitário de cada peça 1,
		 o código de uma peça 2, o número de peças 2 e o valor 
		 unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd_prod1, qtd_prod2;
		double valUnit1, valUnit2, valorTot1, valorTot2, valorTotal;
		
		System.out.println("Codigo produto 1: ");
		cod1 = sc.nextInt();
		System.out.println("Qtd de produto 1: ");
		qtd_prod1 = sc.nextInt();
		System.out.println("Valor unit prod 1: ");
		valUnit1 =sc.nextDouble();
		
		System.out.println("Codigo produto 2: ");
		cod2 = sc.nextInt();
		System.out.println("Qtd de produto 2: ");
		qtd_prod2 = sc.nextInt();
		System.out.println("Valor unit prod 2: ");
		valUnit2 =sc.nextDouble();
		
		valorTot1 = qtd_prod1 * valUnit1;
		valorTot2 = qtd_prod2 * valUnit2;
		valorTotal = valorTot1 + valorTot2; 
		
		System.out.printf("VALOR A PAGAR R$ %.2f", valorTotal);		

		sc.close();
	}

}
