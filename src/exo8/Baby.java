package exo8;

import java.util.Scanner;

public class Baby {
    private final String name;

    public Baby() {
        this.name = returnName();
    }

    public String returnName() {
        String name;

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom :");
        name = scan.nextLine();
        scan.close();
        return name;
    }

    public void displayName(){
        System.out.println("Le nom est "+this.name+". Félicitation !");
    }
}
