package main.exo26;

public class Exercice26 implements Runnable{
    @Override
    public void run() {
        MathInterface calculQuiMultiplieParDeux = ( i,  j) -> i * 2;
        MathInterface calculQuiDiviseParDeux = (i, j) -> i / 2;

        System.out.println(calculQuiMultiplieParDeux.monCalcul(4, 4));
        System.out.println(calculQuiMultiplieParDeux.monCalcul(8, 8));
        System.out.println(calculQuiDiviseParDeux.monCalcul(20, 20));
    }
}

interface MathInterface {
    int monCalcul(int i, int j);
}
