package Exercise3.entities;

public class OrderItem {

    // atributos
    private Integer quantity;
    private Double price;

    private Product product;

    // construtores
    public OrderItem(){
    }

    public OrderItem(int quantity, double price, Product product){
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // geters
    public Integer getQuantity(){
        return quantity;
    }
    public Double getPrice(){
        return price;
    }
    public Product getProduct(){
        return product;
    }

    // método que retorna o valor total desse OrderItem
    public Double subTotal(){
        return quantity * price;
    }

}
