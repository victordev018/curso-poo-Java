package Matrizes.exercise;

//Descrição:
/*Fazer um programa para ler dois números inteiros M e N, e depois ler
Uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // lendo M e N:
        System.out.print("> M: ");
        int M = in.nextInt();
        System.out.print("> N: ");
        int N = in.nextInt();

        // criando matriz de M linhas e N colunas:
        int[][] mat = new int[M][N];

        // lendo valores para a matriz:
        for (int i = 0; i < mat.length; i++){           // para cada linha
            for (int j = 0; j < mat[i].length; j++){    // para cada elemento
                mat[i][j] = in.nextInt();
            }
        }

        // exibindo valores da matriz:
        System.out.println("> Matriz:");
        for (int i = 0; i < mat.length; i++){           // para cada linha
            for (int j = 0; j < mat[i].length; j++){    // para cada elemento
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // entrando com valor X:
        System.out.print("\n> X: ");
        int X = in.nextInt();

        // procurando ocorrências de X:
        for (int i = 0; i < mat.length; i++){           // para cada linha
            for (int j = 0; j < mat[i].length; j++){    // para cada elemento

                if (mat[i][j] == X){    // se elemento atual for igual a X
                    System.out.println("Position: " + i + "," + j + ":");  // exibe posição da ocorrência

                    if (j != 0) {                                    // tem elemento na esquerda?
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j != mat[i].length - 1) {                    // tem elemento na direita?
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i != 0){                                     // tem elemento em cima?
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i != mat.length - 1){                        // tem elemento em baixo?
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }

            }
        }

        in.close();
    }
}
