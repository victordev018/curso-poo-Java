package repeticoes;
import java.util.Locale;
import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do{
			System.out.print("Informe temperatura (°C): ");
			double tempCelsius = sc.nextFloat();
			double tempFahrenheit = (9*tempCelsius/5.0)+32;
			System.out.printf("O valor %.1f celsius = %.1f fahrenheit...%n", tempCelsius,tempFahrenheit);
			System.out.print("deseja converter outra temperatura? [S/N]: ");
			resp = sc.next().charAt(0);
		}while(resp != 'N');
		
		
		sc.close();
	}

}
