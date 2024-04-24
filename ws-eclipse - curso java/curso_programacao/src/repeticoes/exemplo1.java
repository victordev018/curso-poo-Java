package repeticoes;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		
		x = sc.nextInt();
		soma = 0;
		
		while ( x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("SOMA: "+soma);
		
		sc.close();
	}

}
