package functionWithFunctionArguments.example.model.services;

import functionWithFunctionArguments.example.model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    // método estático que realiza a soma de preços dos produtos de uma lista que atendam um predicadp
    public static Double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        // para cada produto da lista
        for (Product p : list){
            // testa se atende ao predicado
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
