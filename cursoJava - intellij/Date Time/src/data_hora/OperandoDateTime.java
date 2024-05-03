package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperandoDateTime {
    public static  void main(String[] args){

        // Instanciando datas para teste:
        LocalDate d01 = LocalDate.parse("2024-05-02");
        LocalDateTime d02 = LocalDateTime.parse("2024-05-02T20:18");
        Instant d03 = Instant.parse("2024-05-02T20:18:12Z");

        // Criar novas datas fazendo operações com munus e plus:

        // próxima semana e semana passada para d01:
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        LocalDate passWeekLocalDate = d01.minusDays(7);

        // proxiam semana e semana passada para d02:
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        LocalDateTime passWeekLocalDateTime = d02.minusDays(7);

        // próxima semana e semana passada para d03:
        // neste caso como se trata de um Instant, tipo Global, temos de usar o ChronoUnit.IDENTIFICADORDATA
        // para conseguir acessar a parte de datas.
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
        Instant passWeekInstant = d03.minus(7, ChronoUnit.DAYS);

        // exbibindo novas datas:
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("passWeekLocalDate: " + passWeekLocalDate);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
        System.out.println("passWeekLocalDateTime: " + passWeekLocalDateTime);
        System.out.println("nextWeekInstant: " + nextWeekInstant);
        System.out.println("passWeekInstant: " + passWeekInstant);
    }
}
