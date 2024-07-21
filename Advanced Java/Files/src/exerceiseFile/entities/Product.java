package exerceiseFile.entities;

public class Product {

    // atributos
    private String name;
    private Double price;
    private Integer quantity;

    // construtor
    public Product(){
    }

    public Product(String[] line){
        this.name = line[0];
        this.price = Double.parseDouble(line[1]);
        this.quantity = Integer.parseInt(line[2]);
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // método para calcular o preço total do produto
    private Double totalValue(){
        return price * quantity;
    }

    // sobreposição do método toString()
    @Override
    public String toString(){
        return name + ", " + String.format("%.2f", totalValue());
    }

}
