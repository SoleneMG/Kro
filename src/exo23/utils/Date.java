package exo23.utils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date {
    final DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate switchStringtoLocalDate(String date)  {
        return LocalDate.parse(date, dateTimeFormatter);
    }

    public String switchLocalDatetoString(LocalDate localDate){
        return localDate.toString();
    }
}
