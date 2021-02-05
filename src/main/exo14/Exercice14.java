package main.exo14;

public class Exercice14 implements Runnable{

    public void run() {
       // Operation operation1= new Operation(-50.55f,"24/12/2020","achat cadeau de Noel");
      //  System.out.println(operation1.toString());

        Compte compte1 = new Compte(123453,"M. DUPONT", 300.55f,"21/01/2007");
        System.out.println(compte1.toString());
    }
}
