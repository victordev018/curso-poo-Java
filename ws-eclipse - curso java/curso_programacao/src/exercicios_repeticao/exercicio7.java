package exercicios_repeticao;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			int quad = (int) Math.pow(i,2);
			int cubo = (int) Math.pow(i,3);
			System.out.printf("%d %d %d %n",i,quad,cubo);
		}
		
		
		sc.close();
	}

}
