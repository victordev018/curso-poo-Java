package consumerLambda.exercise.application;

import predicateLambda.exercise.entitle.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // instanciando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // adicinando produtos na lista
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // variável que guarda o fator de aumento no preço dos produtos
        double factor = 1.1;

        // aumentando o preço de todos os produtos da lista em 10%
        // usamos o metpdp default forEach() da classe List<>, que percorre toda a lista e executa alguma
        // função a partir do Consumer<> passado a ela
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        // percorrendo a lista de produtos usando o forEcah() com o consumer da função println
        list.forEach(System.out::println);
    }
}
