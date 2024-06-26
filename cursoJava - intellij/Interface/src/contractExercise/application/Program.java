package contractExercise.application;

import contractExercise.model.entities.Contract;
import contractExercise.model.entities.Installment;
import contractExercise.model.services.ContractService;
import contractExercise.model.services.OnlinePaymentService;
import contractExercise.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // formato de entrada de datas
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter with contract datas:");
        System.out.print("Number: ");
        int number = in.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(in.next(), fmt);
        System.out.print("Contrat value: ");
        Double totalValue = in.nextDouble();
        System.out.print("Enter the number of installments: ");
        int numberInstallments = in.nextInt();

        // instanciando novo contrato
        Contract contract = new Contract(number, date, totalValue);

        // instanciando serviço de contrato
        ContractService service = new ContractService(new PaypalService());

        // processando o contrato com o serviço de contrato
        service.processContract(contract, numberInstallments);

        // exibindo os dados de cada uma das parcelas para este contrato
        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        in.close();
    }
}
