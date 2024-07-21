package contractExercise.model.services;

// interface de serviço de pagamentos online
public interface OnlinePaymentService {
    // delaração do método da taxa de pagamento
    double paymentFee(Double amount);
    // declaração do método de calcular juros
    double interest(Double amount, int months);
}
