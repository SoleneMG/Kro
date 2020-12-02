package exo18;

import java.util.Random;

public class IntUtils {
    static private Random random = new Random();

    static int randomize(int min, int max) {
        return random.nextInt((max-min)+1)+min;
    }
}
