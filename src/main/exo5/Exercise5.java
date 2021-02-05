package main.exo5;

/**
 * 1- Créer une classe rectangle avec une int height et une int length
 * 2- Faire un constructeur qui prend en paramètre les deux variables
 * 3- faire une méthode computeArea qui retourne la surface
 * 4- dans main créer deux rectangles avec des dimensions différentes, et faire la somme de leurs surfaces dans une variable
 * 5- afficher la somme des deux variables dans la console
 */
public class Exercise5 implements Runnable {
    @Override
    public void run() {

        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(30, 10);
        int sumOfArea = rectangle1.getArea() + rectangle2.getArea();
        System.out.println("The sum is " + sumOfArea + " m2");
    }
}
