package exo4;

public class House extends Town {
    final private int area;

    public House(int area){
        this.area = area;
        numberOfHouse++;
    }

    public void displayArea(){
        System.out.println("This house has " +area +"m2.");
    }
}
