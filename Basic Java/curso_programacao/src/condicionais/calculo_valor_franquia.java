package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class calculo_valor_franquia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//declaração de var
		int qtd_minuto, excedencia;
		double valor_plano;
		
		//chamar variaveis
		System.out.println("Informe a quantidade de minutos que consumiu: ");
		qtd_minuto = sc.nextInt();
		valor_plano = 50.00;
		excedencia = 0;
		
		if (qtd_minuto > 100) {
			excedencia = qtd_minuto - 100;
		}else {
			excedencia = 0;
		}
		
		if (excedencia == 0) {
			valor_plano = 50.00;
		}
		else {
			valor_plano = 50.00 + (excedencia * 2);
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valor_plano);
		
		sc.close();
	}

}
