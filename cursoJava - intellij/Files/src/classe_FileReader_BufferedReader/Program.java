package classe_FileReader_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args){

        // definindo caminho de um arquivo em uma string
        String path = "c:\\temp\\in.txt";

        // objeto da classe FileReader, lê um caractere por vez de um arquivo
        FileReader fr = null;
        // objeto da classe BufferedReader, melhor desempenho de leitura de arquivos
        BufferedReader br = null;

        try {
            // passando caminho do arquivo para o objeto fr
            fr = new FileReader(path);
            // passando fr para o objteo br
            br = new BufferedReader(fr);

            // método readLine() lê uma linha do arquivo, se estiver no final retorna nulo
            String line = br.readLine();

            // enquanto a linha for diferente de nulo
            while (line != null){
                // exiba o conteúdo da linha
                System.out.println(line);
                // atualiza line com a próxima linha do arquivo
                line = br.readLine();
            }
        }
        // caso levante uma exceção
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            // tente fechar os arquivos
            try {
                // se o arquivo tiver algum valor
                if (br != null){
                    // feche o arquivo
                    br.close();
                }
                // se orquivo tiver algum valor
                if (fr != null){
                    // feche o arquivo
                    fr.close();
                }
            }
            // caso dê exceção ao fechar os arquivos
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
