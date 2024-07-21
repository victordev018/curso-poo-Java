package Set.exerciseCourses.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // criando os HashSet dos cursos a, b e c
        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        // adiconando os alunos para cada um dos cursos:

        // CURSO A
        System.out.print("> How many students for course A: ");
        int n = in.nextInt();

        for (int e = 0; e < n; e++){
            courseA.add(in.nextInt());
        }

        // CURSO B
        System.out.print("> How many students for course B: ");
        n = in.nextInt();

        for (int e = 0; e < n; e++){
            courseB.add(in.nextInt());
        }

        // CURSO C
        System.out.print("> How many students for course C: ");
        n = in.nextInt();

        for (int e = 0; e < n; e++){
            courseC.add(in.nextInt());
        }

        // fazendo a conjunção de todos os cursos para ter somente valores únicos
        Set<Integer> students = new HashSet<>(courseA);
        students.addAll(courseB);
        students.addAll(courseC);

        // exibindo a quantidade de alunos deste professor dos cursos a b c
        System.out.println("Total students: " + students.size());
    }
}
