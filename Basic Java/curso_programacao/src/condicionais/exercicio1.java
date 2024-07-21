package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//classe que permite usar . em numeros com ponto flutuante(float, double...)
		Locale.setDefault(Locale.US);
		//chamando classe para pedir dados
		Scanner sc = new Scanner(System.in);
		
		//declaration var
		double nota1, nota2, media;
		char conceito;
		String situacao;
		
		//input´s
		System.out.println("Nota 1:");
		nota1 = sc.nextDouble();
		
		System.out.println("Nota 2:");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if (media>=9 && media<=10) {
			conceito = 'A';
		}
		else if (media>=7.5 && media<=9) {
			conceito = 'B';
		}
		else if (media>=6.0 && media<=7.5) {
			conceito = 'C';
		}
		else if (media>=4.0 && media<=6.0) {
			conceito = 'D';
		}
		else {
			conceito = 'E';
		}
		
		if (conceito == 'A'||conceito == 'B'||conceito == 'C') {
			situacao = "APROVADO";
		}else {
			situacao = "RREPROVADO";
		}
		
		System.out.printf("Nota 1: %.2f Nota 2: %.2f Média: %.2f%n", nota1, nota2, media);
		System.out.printf("Sitauação: %s Conceito: %s", situacao, conceito);
		
		sc.close();
	}

}
