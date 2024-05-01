package data_hora;

import java.io.*;
//importando Classes de DateTime (local e Global)
import java.time.Instant;  // -> Global(com fuso horário)
import java.time.LocalDate;     //-> Local (data)
import java.time.LocalDateTime;  // -> Local (Date e Time)


public class DateTime {

    public static void main(String[] args){

        // Instanciando Datas e Horários Atua
        // método estático now(), devolve a data  hoário atual

        LocalDate d01 = LocalDate.now();            // data Local
        LocalDateTime d02 = LocalDateTime.now();    // data e hora local
        Instant d03 = Instant.now();                // data e hora Global(padrão GMT/UTC) -> Londres

        // Criando datas e horários
        // o método parse(), permite criar datas e/com horários, pelo padrão ISO 8601

        LocalDate d04 = LocalDate.parse("2005-06-24");
        LocalDateTime d05 = LocalDateTime.parse("2005-06-24T22:34:08");
        Instant d06 = Instant.parse("2005-06-24T22:34:08Z");        // 'Z' indica o horário para o padrão GMT
        Instant d07 = Instant.parse("2005-06-24T22:34:08-03:00");   // -03:00 indica 3h a menos do padão GMT

        // exbibindo Datas e Horários:
        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);  // formato ISO 8601
        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07);

    }

}
