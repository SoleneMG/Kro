package main.exo4;

public class House {
    final private int area;

    public House(int area) {
        this.area = area;
        Town.numberOfHouse++;
    }

    public void displayArea() {
        System.out.println("This house has " + area + "m2.");
    }
}
