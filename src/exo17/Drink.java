package exo17;

public class Drink {
    public final Integer capacity;

    public Drink(int capacity) {
        this.capacity = capacity;
    }

    public String display() {
        return "Je suis une boisson de " + capacity + "L";
    }

    public int compareToCapacity(Drink drink) {
        if (this.capacity > drink.capacity) {
            return -1;
        } else if (this.capacity == drink.capacity) {
            return 0;
        } else return 1;
    }

    public int compareToType(Drink drink) {
        return 0;
    }
}
