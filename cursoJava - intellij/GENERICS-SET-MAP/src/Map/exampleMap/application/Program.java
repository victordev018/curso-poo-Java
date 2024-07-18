package Map.exampleMap.application;

import Map.exampleMap.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        // instanciando um Map com Key sendo um produto e value a quantidade me estoque
        Map<Product, Double> stock = new HashMap<>();

        // criando produtos
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        // aidicionando novos elemnetos no stock
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        // criando novo produto para futura comparação
        Product ps = new Product("Tv", 900.0);

        // verificando se a estrutura stock possui o objeto ps como key
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
