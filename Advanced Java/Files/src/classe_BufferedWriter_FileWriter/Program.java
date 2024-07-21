package classe_BufferedWriter_FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args){
        // vetor de conteúdo a ser escrito nos arquivos
        String[] lines = new String[]{
                "Good Morning",
                "Good afternoon",
                "Good night"
        };

        // definindo o caminho do arquivo em uma string
        String path = "c:\\temp\\salutation.txt";

        // A classe FileWriter ler arquivos, da mesma forma a BufferedWriter ler, porém mais rápido e fluído
        // new FileWriter(path) -> cria ou recria o arquivo no caminho passado.
        // new FileWriter(path, true) -> escreve no final do arquivo existente

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            // para cada linha no meu vertor lines
            for (String line : lines){
                // escreva a linha atual no arquivo criado
                bw.write(line);
                // para quebrar a linha
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
