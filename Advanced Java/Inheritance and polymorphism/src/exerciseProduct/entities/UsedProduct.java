package exerciseProduct.entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    // formato de exibição da data
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // atributos
    private LocalDate manufactureDate;

    // construtores
    public UsedProduct(){
        super();
    }

    public UsedProduct (String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    // get e  set
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // métodos

    // sobreposição do método priceTag da super classe Product
    @Override
    public String priceTag(){
        // Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
        return getName() +
               " (used) $ "+
               String.format("%.2f", getPrice())+
               " (Manufacture date: " +
               manufactureDate.format(fmt) + ")" ;
    }
}
