package exo9;

import java.io.InputStream;
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
        System.out.println(question);
        int answerInt = scan.nextInt();
        scan.nextLine();
        return answerInt;
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

    public void close() {
        scan.close();
    }
}
