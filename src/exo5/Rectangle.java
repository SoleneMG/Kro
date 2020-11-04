package exo5;

public class Rectangle extends Form {
    private final int length;
    private final int width;

    public Rectangle(int length, int width){
        if (width > length) {
            this.length = width;
            this.width = length;
        } else {
            this.length = length;
            this.width = width;
        }
    }
    public int computeArea(){
        return length*width;
    }

}
