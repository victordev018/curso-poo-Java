package ProductExercise.application;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import ProductExercise.entities.ImportedProduct;
import ProductExercise.entities.Product;
import ProductExercise.entities.UsedProduct;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // formato para instanciar uma data
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // lista dos produtos
        List<Product> listProducts = new ArrayList<Product>();

        // funcionamento principal do programa
        System.out.print("Enter the number of products: ");
        int numProducts = in.nextInt();

        // inserindo os dados de cada um dos produtos
        for (int i = 1; i <= numProducts; i++){
            System.out.println("Product #"+ i + " data:");
            System.out.print("Common, used or imported (c, u, i)? ");
            char typeProduct = in.next().charAt(0);

            // leitura dos dados de cada produto
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Price: ");
            Double price = in.nextDouble();

            // verificando tipo do produto
            if (typeProduct == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = in.nextDouble();
                listProducts.add(new ImportedProduct(name, price, customsFee));
            }
            else if (typeProduct == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(in.next(), fmt);
                listProducts.add(new UsedProduct(name, price, manufactureDate));
            }
            else {
                listProducts.add(new Product(name, price));
            }
        }

        // exibindo etiquetas de cada um dos protutos:
        System.out.println("\nPRICE TAGS:");
        for (Product p : listProducts){
            System.out.println(p.priceTag());
        }
    }

}
