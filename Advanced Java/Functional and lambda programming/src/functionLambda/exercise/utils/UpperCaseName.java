package functionLambda.exercise.utils;

import functionLambda.exercise.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    // sobreposição do método, retorna o um String com o nome do produto em caixa alta
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
