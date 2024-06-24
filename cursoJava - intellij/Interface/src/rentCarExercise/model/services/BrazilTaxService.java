package rentCarExercise.model.services;

// serviço sobre o imposto no brazil, que implementa a interface TaxService
public class BrazilTaxService implements TaxService{

    // método que retorna a quantia de imposto baseado em uma quantidade recebida
    public double tax(double amount){
        // se a quantia for menor ou igual a 100, a taxa é 20%
        if (amount <= 100.00){
            return amount * 0.2;
        }
        // se não for, a taxa é de 15%
        return amount * 0.15;
    }

}
