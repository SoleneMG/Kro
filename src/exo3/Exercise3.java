package exo3;

/*
1- on ne peut modifier que "Person" en ajoutant des variables privées ou en modifiant l'interieur du constructeur ou getCount (pas la signature),
on ne peut pas créer d'autres méthodes
"Coucou je suis l'affichage Beurk n°1"
"Coucou je suis l'affichage Ploup n°2"
"Coucou je suis l'affichage Bibou n°3"

 */

public final class Exercise3 implements Runnable{
    @Override
    public void run() {
        //todo code here
    }
}

final class Person extends AbstractPerson{
    public Person(String name) {
        super(name);
    }

    @Override
    protected int getCount() {
        return 0;
    }
}

abstract class AbstractPerson {
    private final String name;

    AbstractPerson(String name){
        this.name = name;
    }

    abstract protected int getCount();

    public final void display(){
        System.out.println("Coucou je suis l'affichage "+name+" n° "+getCount());
    }
}