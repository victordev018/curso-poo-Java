package exercicios_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int c =1; c <= N; c++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			double div =(double) a/b;
			
			if (b == 0) {
				System.out.println("divisão impossível");
			}else {
				System.out.printf("%.1f",div);
			}
		}
		
		sc.close();
	}

}
