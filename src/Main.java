import exo1.Exercise1;
import exo10.Exercice10;
import exo11.Exercice11;
import exo12.Exercice12;
import exo2.Exercise2;
import exo3.Exercise3;
import exo4.Exercise4;
import exo5.Exercise5;
import exo6.Exercise6;
import exo7.Exercise7;
import exo8.Exercise8;
import exo9.Exercise9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int exerciseToLaunch = 12;
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
                new Exercice12()
        );
    }
}
