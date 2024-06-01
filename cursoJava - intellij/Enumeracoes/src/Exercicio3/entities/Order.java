package Exercicio3.entities;

import java.util.List;
import java.util.ArrayList;
import Exercicio3.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    // formato LocalDateTime:
    private static final DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // atributos:
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    // construtores
    public Order(){
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    // getrs e setrs
    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    // métodos

    // adiciona um novo item da lista de itens
    public void addItem(OrderItem item){
        items.add(item);
    }
    // remove um item da lista de itens
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    // método que calcula e devolve o total a pagar no pedido.
    public Double total(){
        double total = 0.0;

        for (OrderItem item: items){
            total += item.subTotal();
        }

        return total;
    }

    // método to String:
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMARY:\n");
        sb.append("Order moment: " + moment.format(fmt2)+ "\n");
        sb.append("Order statud: " + status + "\n");
        sb.append("Client: "+ client.getName() + " ("+client.getBirthDate().format(fmt3)+") - "+client.getEmail()+"\n");
        sb.append("Order Items:\n");

        for (OrderItem item: items){
            sb.append(item.getProduct().getName()+", $"+String.format("%.2f", item.getPrice())+", Quantity: "
            + item.getQuantity()+", Subtotal: "+ String.format("%.2f", item.subTotal())+"\n");
        }

        sb.append("Total price: $" + String.format("%.2f", total())+"\n");

        return sb.toString();
    }
}
