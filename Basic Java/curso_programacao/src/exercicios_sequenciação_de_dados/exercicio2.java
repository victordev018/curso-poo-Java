package exercicios_sequenciação_de_dados;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		/*Faça um programa para ler o valor do raio de um círculo, 
		e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159*/
		
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		double pi, area;
		int valorRaio;
		
		//entrada
		pi = 3.14159;
		System.out.print("Por favor digite o valor do raio: ");
		valorRaio = sc.nextInt();
		area = pi * Math.pow(valorRaio,2);
				
		System.out.printf("O valor da área do circulo: %f", area);
				
		sc.close();
	}

}
