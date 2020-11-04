package exo5;

/**
1- Créer une classe rectangle avec une int height et une int length
2- Faire un constructeur qui prend en paramètre les deux variables
3- faire une méthode computeArea qui retourne la surface
4- dans main créer deux rectangles avec des dimensions différentes, et faire la somme de leurs surfaces dans une variable
5- afficher la somme des deux variables dans la console
 */
public class Exercise5 implements Runnable{
    @Override
    public void run() {

        Rectangle rectangle1 = new Rectangle(10,5);
        Rectangle rectangle2 = new Rectangle(30,10);
        Form.summerArea = rectangle1.computeArea()* rectangle2.computeArea();
        rectangle1.displaySummerArea();
    }
}
