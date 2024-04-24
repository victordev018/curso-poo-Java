package repeticoes;
import java.util.Scanner;
public class verificar_senha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//criação de var
		int senha_correta, senha;
		
		//declarar var
		senha_correta = 2002;
		System.out.println("Informe a senha de acesso: ");
		senha = sc.nextInt();
		
		while (senha != senha_correta) {
			System.out.println("Senha inválida, por favor digite novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		sc.close();
	}

}
