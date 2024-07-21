package exercícios;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.


import exercícios.entities.Pessoa;

import java.util.Scanner;

public class maisVelho {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai entrevistar? ");
        int n = in.nextInt();
        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];

        for (int c = 0; c < vetorNome.length; c++){
            in.nextLine();
            System.out.printf("Dados da %d° pessoa: %n", c+1);
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Idade: ");
            int idade = in.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            vetorNome[c] = pessoa.getNome();
            vetorIdade[c] = pessoa.getIdade();
        }
        String nomeMaisVelhor = vetorNome[0];
        int idadeMaisVelho = vetorIdade[0];
        for (int c = 0; c < vetorNome.length; c++){
            if (vetorIdade[c] > idadeMaisVelho){
                nomeMaisVelhor = vetorNome[c];
                idadeMaisVelho = vetorIdade[c];
            }
        }
        System.out.printf("%nPessoa Mais velha: %s", nomeMaisVelhor);
    }

}
