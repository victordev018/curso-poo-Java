package Set.comparationTreeSet;

public class Product implements Comparable<Product>{

    // atributos
    private String name;
    private Double price;

    // construtor
    public Product(){
    }

    public Product(String name, Double price) {
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

    @Override
    public int compareTo(Product other) {
        return getName().toUpperCase().compareTo(other.getName().toUpperCase());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
