package test.exception;

import java.util.List;

public abstract class SimpleMath {

    public static double calculeAverage(List<Double> doubleList){
        double average =0.00;
        for (Double aDouble : doubleList) {
            average += aDouble;
        }
       double averageRounded = (double) Math.round(average * 100) / 100;
        return averageRounded/doubleList.size();
    }
}
