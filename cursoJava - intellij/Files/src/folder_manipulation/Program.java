package folder_manipulation;

import java.util.Scanner;
import java.io.File;

public class Program {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);

        // pedindo para o usuário entrar com um caminho de uma pasta
        System.out.print("Enter a folder path: ");
        String strPath = in.nextLine();

        // instnciando objteo da classe File a partir do caminho informado
        File path = new File(strPath);

        // criando um vetor de File, filtrando todas os diretórios ou pastas contidas no caminho path
        File[] folders = path.listFiles(File:: isDirectory);

        // exibindo as pastas guardadas no vetor folders
        System.out.println("Folders:");
        for (File folder : folders){
            System.out.println(folder);
        }

        // criando um vetor de File, agora filtrando a lista de arquivos naquele caiminho path
        File[] files = path.listFiles(File::isFile);

        // exibindo os arquivos guardados no vetor files
        System.out.println("Files:");
        for (File file : files){
            System.out.println(file);
        }

        // criando uma subpasta no caminho informado e guardando resultado da operação em uma boolena
        boolean success = new File(strPath + "\\pastinhaJota").mkdir();
        System.out.println("Directory created successfully: " + success);

        in.close();
    }
}
