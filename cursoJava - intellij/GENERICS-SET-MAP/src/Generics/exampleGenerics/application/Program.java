package Generics.exampleGenerics.application;

import Generics.exampleGenerics.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // instanciando um PrintService
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values: ");
        int quantityValues = in.nextInt();

        // adicionando valores
        for (int i = 0; i < quantityValues; i++){
            ps.addValue(in.nextInt());
        }

        // exibindo os elementos adicionados
        ps.print();
        System.out.println("First: " + ps.first());

       in.close();
    }
}
