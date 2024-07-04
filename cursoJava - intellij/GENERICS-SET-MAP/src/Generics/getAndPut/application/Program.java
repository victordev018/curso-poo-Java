package Generics.getAndPut.application;

import java.util.*;

public class Program {
    public static void main(String[] args){
        // instanciando listas
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(3.14, 6.28);
        List<? super Number> objectsList = new ArrayList<>();

        // copiando conteúdo as duas primeiras listas para a segunda
        copy(integerList, objectsList);
        printList(objectsList);
        copy(doubleList, objectsList);
        printList(objectsList);
    }

    // método para copiar dados de um lista  para outra
    public static void copy(List<? extends  Number> source, List<? super Number> destiny){
//        destiny.addAll(source);
        for (Number number : source){
            destiny.add(number);
        }
    }

    // método para imprimir um array
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
