package functionWithFunctionArguments.example.application;

import functionWithFunctionArguments.example.model.entities.Product;
import functionWithFunctionArguments.example.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // instanciando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // adicionando produtos na lista
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // somando os preços de todos os produtos da lista que atendam a um predicado
        double sum = ProductService.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        // imprimindo o valor total da soma
        System.out.println("Total sum: " + String.format("%.2f", sum));
    }
}
