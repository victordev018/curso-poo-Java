package exercícios;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

import exercícios.entities.Aluno;
import java.util.Scanner;
import java.util.Locale;

public class Aprovados {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = in.nextInt();

        //vetores:
        String[] Nomes = new String[n];
        double[] Nota1 = new double[n];
        double[] Nota2 = new double[n];

        for (int c = 0; c < n; c++){
            in.nextLine();
            System.out.printf("%nDigite nome, primeira e segunda nota do %do aluno:%n", c+1);
            String nome = in.nextLine();
            double nota1 = in.nextDouble();
            double nota2 = in.nextDouble();

            Aluno aluno = new Aluno(nome, nota1, nota2);
            Nomes[c] = aluno.getNome();
            Nota1[c] = aluno.getNota1();
            Nota2[c] = aluno.getNota2();
        }

        System.out.println("ALUNOS APROVADOS:");
        for (int c = 0; c < Nomes.length; c++){
            if (ta_aprovado(Nota1[c], Nota2[c])){
                System.out.println(Nomes[c]);
            }
        }

        in.close();
    }

    public static Boolean ta_aprovado(double n1, double n2){
        if ((n1+n2)/2.0 >= 6.0){
            return true;
        }
        else {
            return false;
        }
    }

}
