import exo1.Exercise1;
import exo2.Exercise2;
import exo3.Exercise3;
import exo4.Exercise4;
import exo5.Exercise5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int exerciseToLaunch = 3;
        List<Runnable> exercises = getExercises();
        exercises.get(exerciseToLaunch-1).run();
    }

    private static List<Runnable> getExercises() {
        return Arrays.asList(
                new Exercise1(),
                new Exercise2(),
                new Exercise3(),
                new Exercise4(),
                new Exercise5()
        );
    }
}
