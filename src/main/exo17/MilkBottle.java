package main.exo17;

public class MilkBottle extends Drink {

    public MilkBottle(int capacity) {
        super(capacity);
    }

    @Override
    public String display() {
        return "Je suis une bouteille de lait de " + capacity + "L";
    }

    @Override
    public int compareToCapacity(Drink drink) {
        return super.compareToCapacity(drink);
    }

    @Override
    public int compareToType(Drink drink) {
        if (drink instanceof MilkBottle) {
            return compareToCapacity(drink);
        } else return -1;
    }
}
