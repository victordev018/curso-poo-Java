package Set.equalityHashSet;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        // criando um hashSet de Products
        Set<Product> productSet = new HashSet<>();

        // adiconando produtos na lista
        productSet.add(new Product("TV", 900.0));
        productSet.add(new Product("Notebook", 1200.0));
        productSet.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        // verificando se na lista productSet possue o objeto prod
        System.out.println(productSet.contains(prod));

    }
}
