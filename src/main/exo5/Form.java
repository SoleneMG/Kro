package main.exo5;

public abstract class Form {
    int area;

    public Form() {
        this.area = getArea();
    }

    public abstract int getArea();

}
