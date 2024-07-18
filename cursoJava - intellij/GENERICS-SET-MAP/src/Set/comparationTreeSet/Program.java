package Set.comparationTreeSet;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        // criando um TreeSet de Pro
        Set<Product> set = new TreeSet<>();

        // adicionando produtos na lista
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        // percorrendo a lista para checar se foram ordenados baseado em seus nomes em ordem alfabética
        for (Product p : set){
            System.out.println(p);
        }

    }
}
