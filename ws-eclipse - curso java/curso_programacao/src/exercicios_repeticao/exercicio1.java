package exercicios_repeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if(X >= 1 && X <=1000)
		{
			for (int c = 1; c <= X; c++) {
				if (c % 2 != 0)
				{
					System.out.println(c);
				}
			}
		}
		else 
		{
			System.out.print("Numero fora do intervalo!");
		}
		
		
		sc.close();
	}

}
