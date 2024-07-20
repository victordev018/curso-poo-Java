package functionLambda.exercise.application;

import functionLambda.exercise.entities.Product;
import functionLambda.exercise.utils.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        // instanciando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // adicionando produtos na lista
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // criando uma nova lista com os nomes dos produtos de list, em caixa alta
        // a função map(Function<T, R>), aplica uma função para cada elemento de uma stream

        List<String> names =  list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        // exibindo a lista de nomes de produtos
        names.forEach(System.out::println);
    }
}
