package exo4;

/**
 * Créer une classe House avec une surface en m2
 * Faire une méthode display qui indique le nombre de m2
 * Faire une classe Town qui a une variable statique numberOfHouses
 * Incrémenter numberOfHouses depuis le constructeur de House
 * Dans main, afficher les m2 de deux maisons
 * Dans la console, afficher "Le nombre de maisons de la ville est de ..."
 */
public class Exercise4 implements Runnable{
    @Override
    public void run() {
    House house1 = new House(50);
    House house2 = new House(120);
    house1.displayArea();
    house2.displayArea();
    house1.displaynumberOfHouse();
    }
}