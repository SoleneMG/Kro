package test;

import java.util.List;
import java.util.Random;

public abstract class Utils {

    public static Double randomDouble() {
        // génère un entier entre une température min et max
        int min = -20;
        int max = 20;
        int randomTemperature = new Random().nextInt((max - min + 1)) + min;
        // génère le flottant entre 0 et 1 et l'additionne à l'entier généré
        double temperature = randomTemperature + new Random().nextDouble();
        // retourne une température arrondi à 2 chiffres après la virgule
        return (double) Math.round(temperature * 100) / 100;
    }

    public static void displayList(List<Double> list) {
        for (Double aDouble : list) {
            System.out.println(aDouble + "°C");
        }
    }
}
