package Aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

    public  static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Student aluno = new Student();

        //dados aluno
        aluno.name = in.nextLine();
        aluno.note1 = in.nextDouble();
        aluno.note2 = in.nextDouble();
        aluno.note3 = in.nextDouble();

        System.out.println("Final Grade: "+ String.format("%.2f", aluno.FinalGrade()));

        if (aluno.FinalGrade()>=60.00){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("Missing " + String.format("%.2f",aluno.Missing()) + " ponts.");
        }

        in.close();

    }
}
