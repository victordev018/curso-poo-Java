package predicateLambda.exercise.application;

import predicateLambda.exercise.entitle.Product;
import predicateLambda.exercise.utils.MyPredicate;

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

        // removendo produtos da lista que atenda a um predicado(método removeIf(Predicate) recebe um predicado
        // como argumento
        list.removeIf(Product::nonStaticProductPredicate);

        // imprimindo a lista de produtos
        for (Product p : list){
            System.out.println(p);
        }
    }
}
