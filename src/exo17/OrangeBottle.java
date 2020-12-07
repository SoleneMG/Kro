package exo17;

public class OrangeBottle extends Drink {

    public OrangeBottle(int capacity) {
        super(capacity);
    }

    @Override
    public String display() {
        return "Je suis une bouteille d'orange de " + capacity + "L";
    }

    @Override
    public int compareToCapacity(Drink drink) {
        return super.compareToCapacity(drink);
    }

    @Override
    public int compareToType(Drink drink) {
        if (drink instanceof OrangeBottle) {
            return compareToCapacity(drink);
        } else return 1;
    }
}
