package ProductExercise.entities;

public class Product {

    // atributos
    private String name;
    private Double price;

    // construtores
    public Product(){
    }

    public Product (String name , Double price){
        this.name = name;
        this.price = price;
    }

    // get e set
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // método que retorna a etiqueta do produto
    public String priceTag(){
        return name + " $ " + String.format("%.2f", price);
    }
}
