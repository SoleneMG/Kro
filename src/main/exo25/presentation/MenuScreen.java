package main.exo25.presentation;

import main.exo9.MyScanner;

public class MenuScreen extends Screen{

    public MenuScreen(ScreenManager screenManager, MyScanner myScanner) {
        super(screenManager, myScanner);
    }

    @Override
    public void display() {
        displayMenu();
    }

    private void displayMenu(){
        int choice = myScanner.returnInt("Voulez-vous enregistrer une personne (1) ou finaliser la commande (2) ?");

        switch (choice) {
            case 1:
                screenManager.display(new RegisterScreen(screenManager,myScanner));
                break;
            case 2 :
                screenManager.display(new OrderScreen(screenManager,myScanner));
                break;
            default:
                System.out.println("Tu sais pas taper retourne chez ta mère");
                displayMenu();
        }
    }
}
