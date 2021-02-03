package exo23.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

public class DateUtils {

    private final static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate switchStringtoLocalDate(String date) {
        return LocalDate.parse(date, dateTimeFormatter);
    }

    /*** @return Date ou @null ***/
    public static Optional<Date> switchStringtoOptionalDate(String dateString) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(date);
    }

    public static String switchDatetoString(Date date){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return simpleDateFormat.format(date);
    }

    public static String switchLocalDatetoString(LocalDate localDate) {
        return localDate.toString();
    }


}
