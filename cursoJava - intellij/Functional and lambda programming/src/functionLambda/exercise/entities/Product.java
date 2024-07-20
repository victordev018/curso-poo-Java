package functionLambda.exercise.entities;

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
    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // método estático que recebe um produto e e retorna uma String com o nome do produto em caixa alta
    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }

    // sobreposição do método toString()
    @Override
    public String toString(){
        return "Product : [ name = " + getName() + ", price = R$ " + String.format("%.2f",getPrice()) + " ]";
    }
}
