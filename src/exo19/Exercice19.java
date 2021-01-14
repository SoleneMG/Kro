package exo19;

import exo9.MyScanner;

import java.io.*;


public class Exercice19 implements Runnable {
    /* 1 - Demande nom + prénom et l'enregistrer dans un fichier texte
       2-  Lis le fichier, inverser le prénom et le nom puis enregistrer dans un autre fichier

     */
    @Override
    public void run() {
        MyScanner sc = new MyScanner(System.in);
        String name = sc.returnString("Quel est votre nom ?");
        String firstName = sc.returnString("Quel est votre prénom ?");
        String text = name+" "+firstName;
        String fileName = "./test.txt";
        String fileReverseTextName = "./test2.txt";

        try {
            writeFile(text, fileName);
            String textRead = readFile(fileName);
            String reverseText = reverseTextByWords(textRead);
            writeFile(reverseText, fileReverseTextName);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public void writeFile(String text, String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        file.write(text);
        file.flush();
        file.close();
    }

    public String readFile(String fileName) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        String text = read.readLine();
        System.out.println(text);
        return text;
    }

    public String reverseTextByWords(String textRead) {
        StringBuilder reverseText = new StringBuilder();
        String[] word = textRead.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            reverseText.append(word[i]).append(" ");
        }
        System.out.println(reverseText);
        return String.valueOf(reverseText);
    }

}

