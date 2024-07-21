package Generics.delimitedGenerics.entities;

import java.lang.reflect.Type;

public class Product implements Comparable<Product>{

    // atributos
    private String name;
    private Double price;

    // construtor
    public Product(){
    }

    public Product(String name, double price){
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

    // sobreposição do método toString()
    @Override
    public String toString(){
        return "Name: " + name + ", price: R$ " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }

    // sobreposição do método compareTo
}
