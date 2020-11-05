package exo8;
public class Baby {
    private final String name;

    public Baby(String name) {
        this.name = name;
    }

    public void displayName(){
        System.out.println("Le nom est "+this.name+". Félicitation !");
    }
}
