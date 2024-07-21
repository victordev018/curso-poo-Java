package comparatorLambda.application;

import comparatorLambda.entities.Product;

import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // declarando uma lista de produtos usando o ArrayList
        List<Product> list = new ArrayList<>();

        // adicionando produtos na lista
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // ordenando a lista de produtos em ordem alfabética dos nomes dos produtos
        // para isso usamos o método sort da interface List, que recebe um objeto do tipo que Comparator
        // objeto esse que implementa o método compare, para comparar os objetos
        // refatoramos todaa implementação com uma expressão lambda, arrow function

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // imprime a lista ordenada
        for (Product p : list){
            System.out.println(p);
        }
    }
}
