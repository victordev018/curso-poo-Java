package Exercicio3.Aplication;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Exercicio3.entities.Client;
import Exercicio3.entities.Order;
import Exercicio3.entities.OrderItem;
import Exercicio3.entities.Product;
import Exercicio3.enums.OrderStatus;


public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // formato para entrada de data:
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // entrada de dados do cliente:
        System.out.println("Enter a client data:");
        System.out.print("Name: ");
        String clientName = in.nextLine();
        System.out.print("Email: ");
        String clientEmail = in.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        LocalDate clientBirthDate = LocalDate.parse(in.next(), fmt1);

        // Instanciando cliente com esses dados:
        Client client = new Client(clientName, clientEmail, clientBirthDate);

        // entradando com os dados do pedido:
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(in.next().toUpperCase());
        System.out.print("How many items to this order? ");
        int n = in.nextInt();

        // instanciando novo pedido:
        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 1; i <= n; i++){
            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name: ");
            in.nextLine();  // zerando buffer
            String productName = in.nextLine();
            System.out.print("Product price: ");
            double productPrice = in.nextDouble();
            System.out.print("Quantity: ");
            int quantity = in.nextInt();

            // instanciando produto
            Product product = new Product(productName, productPrice);
            // instanciando item
            OrderItem item = new OrderItem(quantity, productPrice, product);

            // aidivionando item no pedido
            order.addItem(item);
        }

        // exibindo sumário de pedido:
        System.out.println(order);

        in.close();
    }

}
