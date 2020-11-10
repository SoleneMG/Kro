package exo9;

import java.io.InputStream;
import java.util.Scanner;

public class MyScanner {
    Scanner scan;
    String answerString;
    int answerInt;

    public MyScanner(InputStream in) {
        scan = new Scanner(in);
    }

    public String returnString(String question) {
        System.out.println(question);
        return answerString = scan.nextLine();
    }

    public int returnInt(String question) {
        System.out.println(question);
        answerInt = scan.nextInt();
        scan.nextLine();
        return answerInt;
    }

    public void close() {
        scan.close();
    }
}
