package StructureTryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        // código que vai tentar ser executado
        try {
            // criando vetor de palavras separadas pelo espaço no momento da entrada
            String[] words = in.nextLine().split(" ");
            int index = in.nextInt();
            System.out.println(words[index]);
        }
        // caso levante a exceção de index inválido
        catch (IndexOutOfBoundsException indexInvalid){
            System.out.println("Invalid index!");
        }
        // caso levante a exeção de entrada não compatível
        catch (InputMismatchException inputInvalid){
            System.out.println("incompatible input");
        }

        in.close();
    }

}



