package predicateLambda.exercise.utils;

import predicateLambda.exercise.entitle.Product;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Product> {
    // sobreposição do método de testar se um produto possui um preço maior ou igaul a R$ 100.00
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
