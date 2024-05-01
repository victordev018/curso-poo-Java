package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateHoraToString {

    public static void main(String[] args){
        // exemplos de objetos data time
        LocalDate d01 = LocalDate.parse("2003-02-19");
        LocalDateTime d02 = LocalDateTime.parse("2005-06-24T20:14");
        Instant d03 = Instant.parse("2003-02-19T01:30:21Z");

        // Criando formatos para converter data-hora para texto customizado:
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // para datas
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM//yyyy HH:mm"); // data e Hora:

        // para o tipo data hora global, é obrigatório especificar a Zona, então criamos nosso formato customizado
        // e chamammos o withZone, e passamos como parâmetro o ZoneId.systemdefault(), que devolve o fuso horário
        // da maquina em que é executado:
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("d/MM//yyyy HH:mm").withZone(ZoneId.systemDefault());


        // exibindo datas horas com formnato customizado chamando o método format e passando o formato como parâmetro:
        System.out.println("d01: " + d01.format(fmt1));
        System.out.println("d02: " + d02.format(fmt2));
        System.out.println("d03: " + fmt3.format(d03));  // Instant não possue o método format
    }

}
