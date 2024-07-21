package repeticoes;
import java.util.Scanner;
public class quadrante {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		int x, y;
		
		//chamada de variáveis
		System.out.println("X: ");
		x = sc.nextInt();
		System.out.println("Y: ");
		y = sc.nextInt();
		
		while (x!=0 && y!=0) {
			if (x>0 && y>0) {
				System.out.println("primeiro");
			}else if(x<0 && y>0) {
				System.out.println("segundo");
			}else if(x<0 && y<0) {
				System.out.println("terceiro");
			}else {
				System.out.println("quarto");
			}
			System.out.println("X: ");
			x = sc.nextInt();
			System.out.println("Y: ");
			y = sc.nextInt();	
		}
		
		sc.close();
	}

}
