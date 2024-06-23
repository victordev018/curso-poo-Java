package classe_FileReader_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args){

        // definindo caminho de um arquivo em uma string
        String path = "c:\\temp\\in.txt";

        // objeto da classe FileReader, lê um caractere por vez de um arquivo
        // objeto da classe BufferedReader, melhor desempenho de leitura de arquivos

        // o try-with-resource (try com recurso), pode instanciar os objetos no argumento.
        // esse tipo de try garante que os objetos sejam fechados ao finalizar
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
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
    }
}
