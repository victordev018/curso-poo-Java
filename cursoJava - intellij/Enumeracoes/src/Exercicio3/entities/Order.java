package Exercicio3.entities;

import java.util.List;
import java.util.ArrayList;
import enums.OrderStatus;
import java.time.LocalDateTime;

public class Order {

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
}
