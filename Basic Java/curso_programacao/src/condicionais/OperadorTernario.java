package condicionais;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		String result;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		media = (n1 + n2)/2;
				
	    result = (media >=7)?"Aprovado!":"Reprovado";
	    
	    System.out.println(result);
		sc.close();
	}

}
