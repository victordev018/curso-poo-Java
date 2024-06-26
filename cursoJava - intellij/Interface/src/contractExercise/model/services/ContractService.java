package contractExercise.model.services;

import contractExercise.model.entities.Contract;
import contractExercise.model.entities.Installment;

import java.time.LocalDate;

// classe referente ao serviço de contrato
public class ContractService {

    // declaração de dependência
    private OnlinePaymentService onlinePaymentService;

    // construtor
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    // método para processar as parcelas do contrato
    public void processContract(Contract contract, int months){
        // criando as parcelas de acordo com o numero de months
        for (int i = 1; i <= months; i++){
            // data de vencimento da parcela atual
            LocalDate dueDate = contract.getDate().plusMonths(i);
            // variável para guardar o pagamento básico
            double basicPayment = contract.getTotalValue() / months;    // valores iguais para cada mês
            // pegando o valor de juros para essa parcela
            double interest = onlinePaymentService.interest(basicPayment, i);
            // pegando o valor de taxa para essa parcela
            double fee = onlinePaymentService.paymentFee(basicPayment + interest);
            // valor total  da parcela
            double quota = basicPayment + interest + fee;

            // guardando na lista de parcelas uma nova instância de Installment
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }

}
