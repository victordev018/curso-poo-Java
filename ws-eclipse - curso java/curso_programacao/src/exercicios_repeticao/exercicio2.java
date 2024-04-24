package exercicios_repeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int c = 1; c <= N; c++) {	
			int X = sc.nextInt();
			
			if (X>= 10 && X <= 20)
			{
				in ++;
			}
			else
			{
				out++;
			}
		}
		
		System.out.printf(" %d in%n %d out", in, out);
		
		sc.close();
	}

}
