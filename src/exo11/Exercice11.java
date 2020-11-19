package exo11;

import exo9.MyScanner;

public class Exercice11 implements Runnable {
    @Override
    public void run() {
        SUV mercedesSUV = new SUV("Mercedes SUV");
        SUV renaultSUV = new SUV("Renault SUV");
        SUV peugeotSUV = new SUV("Peugeot SUV");
        Berline peugeot204 = new Berline("Peugeot 204");
        Berline renaultMegane = new Berline("Renault Megane");
        Berline daciaSandero = new Berline("Dacia Sandero");

        Car[] board = new Car[]{mercedesSUV, renaultSUV, peugeotSUV, peugeot204, renaultMegane, daciaSandero};

        MyScanner scan = new MyScanner(System.in);
        int index = scan.returnInt("Veuillez choisir un index entre 0 et 5");
        System.out.println("Est-ce un SUV ?");
        boolean isSUV = (board[index] instanceof SUV);
        String answerSUV = "Oui, c'est un SUV.\n" + "Est-ce une Berline ?\n" + "Non, ce n'est pas une Berline.";
        String answerBerline = "Non, ce n'est pas un SUV.\n" + "Est-ce une Berline ?\n" + "Non, ce n'est pas une Berline.";
        String answer = (isSUV) ? answerSUV : answerBerline;
        System.out.println(answer);
        board[index].display();
    }

}
