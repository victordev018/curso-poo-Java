package contractExercise.model.services;

// serviçi de pagamento Paypal que implementa a interface OnlinePaymentService
public class PaypalService implements OnlinePaymentService{
    // sobreposção do método de calular os juros
    @Override
    public double paymentFee(Double amount) {
        // 2% do valor
        return amount * 0.02;
    }

    // sobreposição do método de calcular o juros para um determinado valor e mês
    @Override
    public double interest(Double amount, int months) {
        // 1% do valor vezes a quantidade de meses
        return amount * 0.01 * months;
    }
}
