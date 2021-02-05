package main.exo25;

import main.exo25.data.database.Database;
import main.exo25.data.database.memory.MemoryDatabase;
import main.exo25.presentation.MenuScreen;
import main.exo25.presentation.ScreenManager;
import main.exo9.MyScanner;

/**
 * enregistre une personne
 * si > 70 ans non trop vieux
 * pas même nom/prénom
 * le prix à afficher, enfant/adulte et gratuit < 3 ans
 *
 * ecran 1 menu enregistre 1 personne ou finaliser (que si ya au moins une personne)
 * ecran 2 enregistre 1 personne
 * encran 3 finaliser commande -> affiche personnes + prix et total
 */
public class Exercice25 implements Runnable{
    final ScreenManager screenManager = new ScreenManager();
    final MyScanner myScanner = new MyScanner(System.in);
    public static final Database database = new MemoryDatabase();

    @Override
    public void run() {
        screenManager.display(new MenuScreen(screenManager,myScanner));

        myScanner.close();
    }
}
