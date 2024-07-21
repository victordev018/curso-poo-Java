package repeticoes;
import java.util.Scanner;
public class combustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declaração de variáveis
		int cod, alcool, gasolina, disel;
		
		//entrada de dados
		cod = sc.nextInt();
		alcool = 0;
		gasolina = 0;
		disel = 0;
		
		while (cod != 4) {
			if (cod <1 || cod >4) {
				cod = sc.nextInt();
			}
			if (cod == 1) {
				alcool += 1;
			}else if (cod == 2) {
				gasolina += 1;
			}else {
				disel += 1;
			}
			cod = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO%n Alcool: %d%n Gasolina: %d%n Disel: %d", alcool, gasolina, disel);
		
		sc.close();
	}

}
