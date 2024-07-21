package Map.exampleMap.entities;

import java.util.Objects;

public class Product {

    // atributos
    private String name;
    private Double price;

    // construtor
    public Product(){
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    // get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // métodos para comparar igualdade dos objetos desta mesma classe baseado em seu nome e preço
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
