package application;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.now(); // instancia com a data atual
        LocalDateTime date2 = LocalDateTime.now(); // instancia com a data-hora atual
        Instant dateGlobal = Instant.now(); // instancia com data-hora global GMT
        LocalDate dateConverte = LocalDate.parse("2020-02-12"); // converte texto para data
        LocalDateTime dateConverte2 = LocalDateTime.parse("2020-02-12T14:32:22"); // converte texo para data-hora
        Instant dateConverte3 = Instant.parse("2024-06-30T16:55:33Z"); // converte texto para data-hora global
        Instant dateConverte4 = Instant.parse("2024-06-30T16:55:33-03:00");
        LocalDate fm = LocalDate.parse("22/05/2024", fomatter); // formata um texto com padrao customizado
        LocalDate date0021 = LocalDate.of(2024, 01, 01); // formata passando como parametro inteiros

        System.out.println(date);
        System.out.println(date2);
        System.out.println(dateGlobal);
        System.out.println(dateConverte);
        System.out.println(dateConverte2);
        System.out.println(dateConverte3);
        System.out.println(dateConverte4);
        System.out.println(fm);
        System.out.println(date0021.format(fomatter));
    }
}
