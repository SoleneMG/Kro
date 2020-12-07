package test;

import test.exception.SimpleMath;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {

        List<Double> listOfTemperature = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfTemperature.add(Utils.randomDouble());
        }
        Utils.displayList(listOfTemperature);
        System.out.println("La moyenne des températures est de "+ SimpleMath.calculeAverage(listOfTemperature)+"°C");
    }


}
