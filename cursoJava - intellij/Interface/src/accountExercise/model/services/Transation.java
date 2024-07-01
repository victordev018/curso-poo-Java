package accountExercise.model.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// classe referente ao serviço de transação
public class Transation {

    // padrão de exxibição de datas
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // atributos
    private String type;    // tipo de transação
    private Double value;   // valor da transação
    private LocalDate date; // data da transação;

    // construtores
    public Transation(){
    }

    public Transation(String type, Double value){
        this.type = type;
        this.value = value;
        this.date = LocalDate.now();
    }

    // método para registrar uma nova transação
    public void recordTransition(){
        System.out.println("Transition: " + type + " value: R$ " + value + " date: " + date.format(fmt));
    }

}
