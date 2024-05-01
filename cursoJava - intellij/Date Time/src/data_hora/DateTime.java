package data_hora;

import java.io.*;
//importando Classes de DateTime (local e Global)
import java.time.Instant;  // -> Global(com fuso horário)
import java.time.LocalDate;     //-> Local (data)
import java.time.LocalDateTime;  // -> Local (Date e Time)


public class DateTime {

    public static void main(String[] args){
        //Instanciando Datas e Horários Atua
        LocalDate d01 = LocalDate.now();  // data Local
        LocalDateTime d02 = LocalDateTime.now(); // data e hora local
        Instant d03 = Instant.now(); // data e hora Global(padrão GMT/UTC) -> Londres


        // exbibindo Datas e Horários:
        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);  // formato ISO 8601


    }

}
