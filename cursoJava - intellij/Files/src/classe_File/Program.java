package classe_File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        // instanciando um objeto da classe File, que guarda referência ao arquivo baseado em seu caminho
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;

        // tente executar
        try {
            // abrindo o arquivo file com uma instancia da classe Scanner
            sc = new Scanner(file);
            // enquanto existir uma proxiam linha no arquivo
            while (sc.hasNextLine()){
                // leia o conteúdo da linha
                System.out.println(sc.nextLine());
            }
        }
        // caso haja uma exceção na abertura do arquivo
        catch (IOException e){
            // mostre a mensagem de erro
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            // se o arquivo existir
            if (sc != null){
                // feche o arquivo
                sc.close();
            }
        }
    }
}
