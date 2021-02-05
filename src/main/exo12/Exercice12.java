package main.exo12;

import main.exo12.models.*;
import main.exo12.models.role.Manage;

public class Exercice12 implements Runnable {

    @Override
    public void run() {
        int numberOfManager=0;
        int indexboardOfManager=0;
        Employee dev1 = new Dev(Factory.OUI);
        Employee dev2 = new Dev(Factory.E_VOYAGEURS);
        Employee tester1 = new Tester(Factory.E_VOYAGEURS);
        Employee productOwner1 = new ProductOwner(Factory.SNCF);
        Employee scrumMaster1 = new ScrumMaster(Factory.SNCF);

        Employee[] board = new Employee[]{dev1, dev2, tester1, productOwner1, scrumMaster1};
        for (Employee employee : board){
            if (employee instanceof Manage){
                numberOfManager++;
            }
        }
        Employee[] boardOfManager = new Employee[numberOfManager];
        for (Employee employee : board) {
            if (employee instanceof Manage) {
                boardOfManager[indexboardOfManager] = employee;
                indexboardOfManager++;
                boardOfManager[indexboardOfManager].describeYourSelf();
            }
        }



        //Employee[] boardOfManager = new Employee[board.length];

       /* System.out.println("Tableau des employés :");
        for (Employee employee : board) {
            employee.describeYourSelf();
            if (employee instanceof Manage) {
                boardOfManager[index] = employee;
                index++;
            }

        }
        System.out.println("Tableau des managers :");
        for (int i=0; i<index; i++) {
            boardOfManager[i].describeYourSelf();
        }

        int numberOfEmployees = board.length;
        System.out.println("Le nombre d'employés est de " + numberOfEmployees);*/

    }
}
