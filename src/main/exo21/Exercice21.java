package main.exo21;

import main.exo20.Exercice20;

import java.io.*;

public class Exercice21 implements Runnable {
    @Override
    public void run() {
        try {
            writeInFile("GROSJEAN", "Solène", 31);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void writeInFile(String name, String firstName, int age) throws IOException {
        File file = new File("./exercice21.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains("age")) {
                    stringBuffer.append(line).append(" ").append(age).append(" ans");
                    stringBuffer.append("\n");
                } else if (line.contains("Nom")) {
                    stringBuffer.append(line).append(" ").append(name);
                    stringBuffer.append("\n");
                } else if (line.toLowerCase().contains("prénom")) {
                    stringBuffer.append(line).append(" ").append(firstName);
                    stringBuffer.append("\n");
                } else {
                    System.out.println(stringBuffer.append(line));
                }
            }
            System.out.println(stringBuffer);
        } finally {
            Exercice20.close(fileReader);
            Exercice20.close(bufferedReader);
        }
    }
}