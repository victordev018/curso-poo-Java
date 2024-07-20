package demoPipeline.example.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        // declarando uma lista de inteiros pre definida
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // criando uma stream a partir de list, multiplicando todos seus elementos por 10
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // pegando o somatório dos elementos da lista com o método reduce de stream
        double sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        // criando uma nova lista multiplicando todos os elementos pares de list por 10
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)    // filtra todos os valores pares
                .map(x -> x * 10)           // multiplica os novos valores por 10
                .collect(Collectors.toList());  // converte a stream para List

        System.out.println(newList);
    }
}
