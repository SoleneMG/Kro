package main.exo18;

import java.util.Random;

public class IntUtils {
    static private Random random = new Random();

    static int randomize(int min, int max) {
        int bound = (max - min) + 1;
        return random.nextInt(bound) + min;
    }
}
