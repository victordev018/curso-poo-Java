package rentCarExercise.model.services;

import rentCarExercise.model.entities.CarRental;
import rentCarExercise.model.entities.Invoice;

import java.time.Duration;

// classe de serviço de aluguel
public class RentalService {

    // atributos
    private Double pricePerHour;    // preço por hora
    private Double pricePerDay;     // preço por dia

    // a classe terá dependência de um TaxService (uma interface genérica)
    private TaxService taxService;    // seriço de imposto

    // construtor
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    // método para processar a fatura de um determinado aluguel de carro
    public void processInvoice(CarRental carRental){

        // pegando a duração entre start e finish em minutos
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        // pconvertendo os minutos para hora em forma de fração (ajuda para fazer o arredondamento)
        double hours = minutes / 60;

        // variável para guardar o pagamento básico
        double basicPayment;

        // se a quantidade de horas for menor igual a 12, será calculada com o preço por hora
        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);     // Math.ceil arredonda o valor para cima
        }
        // se não, será calculado com o preço por dia
        else{
            basicPayment = pricePerDay * Math.ceil(hours / 24); // trata a duração em dias
        }

        // calculando o imposto
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
