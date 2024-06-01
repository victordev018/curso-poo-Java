package Aplication;

import entities.Order;
import enums.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args){
        // instanciando objeto order
        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);
        System.out.println(order);

        // usando o método valueOf da classe OrderStatus para pegar o estado passando o valor como String
        OrderStatus os1 = OrderStatus.SHIPPED;
        OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
        // exiindo valores:
        System.out.println(os1);
        System.out.println(os2);
    }
}
