package condicionais;

import java.util.Scanner;

public class esolha_caso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//declaração de variaveis:
		int dia;
		String dia_semana;
		
		//entrada de dados:
		System.out.println("Informe um numeo entre 1 e 7, correspondendo a um dia da semana");
		dia = sc.nextInt();
		dia_semana = "";
		
		switch (dia) {
			case 1:
				dia_semana = "Domingo";
				break;
			case 2:
				dia_semana = "Segunda";
				break;
			case 3:
				dia_semana = "Terça";
				break;
			case 4:
				dia_semana = "Quarta";
				break;
			case 5:
				dia_semana = "Quinta";
				break;
			case 6:
				dia_semana = "Sexta";
				break;
			case 7:
				dia_semana = "Sábado";
				break;
			default:
				dia_semana = "Invalido";
				break;
		}
		
		System.out.printf("Dia da semana: %s", dia_semana);
		
		sc.close();
	}

}
