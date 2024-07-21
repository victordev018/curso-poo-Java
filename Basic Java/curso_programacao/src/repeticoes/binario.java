package repeticoes;
import java.util.Scanner;

public class binario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>2 && N<100){
            int c = 1;
            int p = 0;
            while (c<=N){
                p = c*N;
                System.out.printf("%d x %d = %d%n", c, N, p);
                c++;
            }
        }
        sc.close();
	}

}
