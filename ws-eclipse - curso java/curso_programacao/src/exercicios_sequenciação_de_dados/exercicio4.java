package exercicios_sequenciação_de_dados;
import java.util.Locale;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, 
		  seu número de horas trabalhadas, o valor que recebe por
          hora e calcula o salário desse funcionário. A seguir, mostre o número 
          e o salário do funcionário, com duas casas
          decimais.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, qtdHoras;
		double valorHora, salario;
		
		System.out.println("Insira um numero:");
		numero = sc.nextInt();
		
		System.out.println("Insira a qtd de horas trabalhadas: ");
		qtdHoras = sc.nextInt();
		
		System.out.println("Insira o valor da hora:");
		valorHora = sc.nextDouble();
		
		salario = qtdHoras * valorHora;
		
		System.out.println("NUMBER: "+ numero);
		System.out.printf("SALARY $ %.2f",salario );
		
		sc.close();

	}

}
