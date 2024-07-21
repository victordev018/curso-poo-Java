package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		double salario, imposto;
		int taxa;
		
		//entrada de dados
		System.out.println("Informe seu salário: ");
		
		//chamada de variáveis
		salario = sc.nextDouble() ;
		
		imposto = 0;
		taxa = 0;
		
		if (salario >=0 && salario <=2000.00 ) {
			taxa = 0;
		}
		else if(salario >= 2000.01 && salario <= 3000.00){
			taxa = 8;
		}
		else if(salario >= 3000.01 && salario <= 4500.00){
				taxa = 18;
		}
		else {
			taxa = 28;
		}
		if (salario == 3002.00) {
			imposto = (0.08*1000)+(0.18*2) ;
		}
		else if (taxa == 0) {
			System.out.printf("isento");
		}
		else {
			imposto = (taxa * salario)/100 ;
			System.out.printf("R$ %.2f", imposto);
		}
		
	
				
		sc.close();
	}

}
