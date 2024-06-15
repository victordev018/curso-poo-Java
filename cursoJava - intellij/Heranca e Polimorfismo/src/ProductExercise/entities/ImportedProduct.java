package ProductExercise.entities;

public class ImportedProduct extends  Product{

    // atributos
    private Double customsFee;

    // construtores
    public ImportedProduct(){
        super();
    }

    public ImportedProduct (String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    // get e set
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // métodos

    // método que retorna o preço total do produto importado
    public Double totalPrice(){
        return getPrice() +customsFee;
    }

    // sobreposição do método priceTag
    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}

