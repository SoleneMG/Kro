package main.exo9;

import main.exo23.utils.DateUtils;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class MyScanner {
    private final Scanner scan;

    public MyScanner(InputStream in) {
        scan = new Scanner(in);
    }

    public String returnString(String question) {
        System.out.println(question);
        return scan.nextLine();
    }

    public int returnInt(String question) {
        try {
            System.out.println(question);
            int answerInt = scan.nextInt();
            scan.nextLine();
            return answerInt;
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Erreur lors de la saisie, veuillez recommencer : ");
            scan.nextLine();
            return returnInt(question);
        }
    }

    public float returnFloat(String question) {
        System.out.println(question);
        float answerFloat = scan.nextFloat();
        scan.nextLine();
        return answerFloat;
    }

    public double returnDouble(String question) {
        System.out.println(question);
        double answerDouble = scan.nextDouble();
        scan.nextLine();
        return answerDouble;
    }

    public boolean returnBoolean(String question) {
        System.out.println(question);
        String answer = scan.nextLine();
        return answer.equalsIgnoreCase("oui");
    }

    public LocalDate returnLocalDate(String question) {
        System.out.println(question);
        String answer = scan.nextLine();
        return DateUtils.switchStringtoLocalDate(answer);
    }

    public Optional<Date> returnOptionalDate(String question) {
        System.out.println(question);
        String answer = scan.nextLine();
        Optional<Date> optionalDate = DateUtils.switchStringtoOptionalDate(answer);
        return optionalDate;
    }

    public void close() {
        scan.close();
    }
}
