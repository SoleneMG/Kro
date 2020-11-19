package exo12;

import exo12.models.*;

public class Exercice12 implements Runnable {

    @Override
    public void run() {
        Employee dev1 = new Dev(Factory.OUI);
        Employee dev2 = new Dev(Factory.E_VOYAGEURS);
        Employee tester1 = new Tester(Factory.E_VOYAGEURS);
        Employee productOwner1 = new ProductOwner(Factory.SNCF);
        Employee scrumMaster1 = new ScrumMaster(Factory.SNCF);

        Employee[] board= new Employee[] {dev1, dev2, tester1, productOwner1, scrumMaster1};

        for (Employee employee : board) {
            employee.describeYourSelf();
        }

        int numberOfEmployees = board.length;
        System.out.println("Le nombre d'employés est de "+numberOfEmployees);

    }
}
