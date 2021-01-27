package exo23.utils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {

    final static DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate switchStringtoLocalDate(String date)  {
        return LocalDate.parse(date, dateTimeFormatter);
    }

    public static String switchLocalDatetoString(LocalDate localDate){
        return localDate.toString();
    }
}
