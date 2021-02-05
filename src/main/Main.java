package main;

import main.exo1.Exercise1;
import main.exo10.Exercice10;
import main.exo11.Exercice11;
import main.exo12.Exercice12;
import main.exo13.Exercice13;
import main.exo14.Exercice14;
import main.exo15.Exercice15;
import main.exo16.Exercice16;
import main.exo17.Exercice17;
import main.exo18.Exercice18;
import main.exo19.Exercice19;
import main.exo2.Exercise2;
import main.exo20.Exercice20;
import main.exo21.Exercice21;
import main.exo22.Exercice22;
import main.exo25.Exercice25;
import main.exo3.Exercise3;
import main.exo4.Exercise4;
import main.exo5.Exercise5;
import main.exo6.Exercise6;
import main.exo7.Exercise7;
import main.exo8.Exercise8;
import main.exo9.Exercise9;
import main.exo23.Exercice23;
import main.exo24.Exercice24;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //LOGGER.log(Level.INFO, "Logger initialisé");
        int exerciseToLaunch = 25;
        List<Runnable> exercises = getExercises();
        exercises.get(exerciseToLaunch - 1).run();
    }

    private static List<Runnable> getExercises() {
        return Arrays.asList(
                new Exercise1(),
                new Exercise2(),
                new Exercise3(),
                new Exercise4(),
                new Exercise5(),
                new Exercise6(),
                new Exercise7(),
                new Exercise8(),
                new Exercise9(),
                new Exercice10(),
                new Exercice11(),
                new Exercice12(),
                new Exercice13(),
                new Exercice14(),
                new Exercice15(),
                new Exercice16(),
                new Exercice17(),
                new Exercice18(),
                new Exercice19(),
                new Exercice20(),
                new Exercice21(),
                new Exercice22(),
                new Exercice23(),
                new Exercice24(),
                new Exercice25()
        );
    }
}
