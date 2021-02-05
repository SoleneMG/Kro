package main.exo24;

import main.exo9.MyScanner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class Exercice24 implements Runnable {
    /*
    1 utilisateur : entrer une date
    si vous voulez modifier l'année le mois le jour ou rien
    combien il veut enlever ou ajouter pour yy -2 ou +2 mm -6 +5 jj -5 +14

    2 utilisateur : entrer deux dates
    les additionner
     */
    @Override
    public void run() {
        MyScanner sc = new MyScanner(System.in);
        int choice = sc.returnInt("Que voulez-vous faire ? \n 1 - Additionner des dates \n 2 - Modifier une date");
        if (choice == 1) {
            Optional<Date> optionalDate1 = sc.returnOptionalDate("Entrez la première date :");
            Optional<Date> optionalDate2 = sc.returnOptionalDate("Entrez la deuxième date :");
            if (optionalDate1.isPresent() && optionalDate2.isPresent()) {
                Date date1 = optionalDate1.get();
                Date date2 = optionalDate2.get();
                Calendar calendarDate1 = calendar(date1);
                Calendar calendarDate2 = calendar(date2);
                calendarDate1.add(Calendar.DATE, calendarDate2.get(Calendar.DATE));
                calendarDate1.add(Calendar.MONTH, calendarDate2.get(Calendar.MONTH));
                calendarDate1.roll(Calendar.YEAR, calendarDate2.get(Calendar.YEAR));
                Date newDate = calendarDate1.getTime();
                DateFormat simpleDateFormat = new SimpleDateFormat("EEE dd MMM yyyy");
                System.out.println(simpleDateFormat.format(newDate));
            }
        } else {
            Optional<Date> optionalDate = sc.returnOptionalDate("Entrez une date :");
            if (optionalDate.isPresent()) {
                Date date = optionalDate.get();
                int doYouWantModify = sc.returnInt("Souhaitez-vous modifier : \n 1 - l'année \n 2 - le mois \n 3 - le jour \n 4 - rien");
                if (doYouWantModify == 1 || doYouWantModify == 2 || doYouWantModify == 3) {
                    Calendar calendar = calendar(date);
                    switch (doYouWantModify) {
                        case 1:
                            displayDateAfterRoll(roll(sc, "années", -2, 2, Calendar.YEAR, calendar));
                            break;
                        case 2:
                            displayDateAfterRoll(roll(sc, "mois", -6, 5, Calendar.MONTH, calendar));
                            break;
                        case 3:
                            displayDateAfterRoll(roll(sc, "jours", -5, 14, Calendar.DAY_OF_MONTH, calendar));
                            break;
                        default:
                            System.out.println("Bye bye");
                    }
                }
            }
        }
    }

    public Calendar calendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public Calendar roll(MyScanner sc, String fieldName, int min, int max, int field, Calendar calendar) {
        int amount = 0;
        do {
            boolean isVowel = "aeiouy".contains(Character.toString(fieldName.charAt(0)));
            if (isVowel) {
                amount = sc.returnInt("Combien voulez-vous ajouter ou soustraire d'" + fieldName + " ? Choisissez une valeur entre " + min + " et " + max + ".");
            } else {
                amount = sc.returnInt("Combien voulez-vous ajouter ou soustraire de " + fieldName + " ? Choisissez une valeur entre " + min + " et " + max + ".");
            }
        } while (amount < min || amount > max);
        calendar.roll(field, amount);
        return calendar;
    }

    public void displayDateAfterRoll(Calendar calendar) {
        Date newDate = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Après roll, nouvelle date : " + dateFormat.format(newDate));
    }
}
