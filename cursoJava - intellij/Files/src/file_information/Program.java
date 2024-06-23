package file_information;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        // obtendo caminho do arquivo
        System.out.print("Enter a file path: ");
        String filePath = in.nextLine();

        // instanciando objeto do tipo File com o caminho informado
        File file = new File(filePath);

        // pegando informações referente ao caminho do arquivo
        System.out.println("getName: " + file.getName());           // nome
        System.out.println("getParente: " + file.getParent());      // caminho do arquvo
        System.out.println("getPath: " + file.getPath());             // caimnho completo até p arquvo

        in.close();
    }
}
