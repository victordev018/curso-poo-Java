package rentCarExercise.model.services;

import rentCarExercise.model.entities.CarRental;
import rentCarExercise.model.entities.Invoice;

// classe de serviço de aluguel
public class RentalService {

    // atributos
    private Double pricePerHour;    // preço por hora
    private Double pricePerDay;     // preço por dia

    // composição
    private BrazilTaxService taxService;    // seriço de imposto

    // construtor
    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    // método para processar a fatura de um determinado aluguel de carro
    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice(50.00, 10.00));
    }
}
