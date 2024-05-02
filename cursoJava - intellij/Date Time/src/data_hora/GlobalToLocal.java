package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocal {
    public static void main(String[] args){

        // Date times
        LocalDate d01 = LocalDate.parse("2003-02-19");
        LocalDateTime d02 = LocalDateTime.parse("2005-06-24T20:14");
        Instant d03 = Instant.parse("2022-07-20T01:30:21Z");    // horário de Londres

        // convertendo de Global para Lccal, usando o ofInstant(date-time, fuso-horário):
        // converte de Global para o Fuso da maquina, ou seja, o local:
        LocalDate r1 = LocalDate.ofInstant(d03,ZoneId.systemDefault());     // -3h
        // converte de Global para o fuso de portugal:
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Portugal"));  // +1h
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());  // -3h
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));  // +1h


        // exibindo resultados
        System.out.println("r1: " + r1);   // 2022-07-19
        System.out.println("r2: " + r2);   // 2022-07-20
        System.out.println("r3: " + r3);   // 2022-07-19T22:30:14
        System.out.println("r4: " + r4);   // 2022-07-20T02:30:14

        // pegando elementos específicos de uma data:
        System.out.println("d01 dia: " + d01.getDayOfMonth());    // devolve o dia daquela data
        System.out.println("d01 mês: " + d01.getMonthValue());    // devolve o dia daquela data
        System.out.println("d01 ano: " + d01.getYear());          // devolve o dia daquela data
        System.out.println("Hora d02: " + d02.getHour());         // devolve a hora daquela data
    }

}
