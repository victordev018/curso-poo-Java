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

                    if (elementLess1(j, mat)) {                                    // tem elemento na esquerda?
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (elementMore1(j, mat)) {                                    // tem elemento na direita?
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (elementLess1(i, mat)){                                     // tem elemento em cima?
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (elementMore1(i, mat)){                                     // tem elemento em baixo?
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }

            }
        }

        in.close();
    }

    // verifica se é possível a existência do elemento a esquerda e em cima
    public static boolean elementLess1(int e, int[][] mat){
        if (e-1 >= 0 && e-1 <= mat.length ){
            return true;
        }
        return false;
    }

    // verifica se é possível a existência do elemento na direita e em baixo
    public static boolean elementMore1(int e, int[][] mat){
        if (e+1 >= 0 && e+1 <= mat.length){
            return true;
        }
        return false;
    }
}
