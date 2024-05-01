package Matrizes;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an arrey order: ");
        int n = in.nextInt();

        // criando um arrey bidimensional de oredem N:
        int[][] mat = new int[n][n];

        // inserindo os 9 elementos na matriz:
        for (int i = 0; i < mat.length; i++){  // acessa as linhas
            for (int j = 0; j < mat[i].length; j++){  // acessa os elementos da linha atual
                mat[i][j] = in.nextInt();
            }
        }

        // exibindo matriz:
        System.out.println("\n> Exbibindo Matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // exibindo diagonal princial:
        System.out.println("\n> Diagonal principal:");
        System.out.print("> ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        // Quantidade de elementos negativos na matriz:
        int qtdNegative = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    qtdNegative++;
                }
            }
        }
        // exibindo quantidade de valores negativos:
        System.out.println("\n> Valores negativos: " + qtdNegative);

    }
}
