package main.exo13.models;
import main.exo13.models.roles.GoogleFunction;
import main.exo13.models.roles.OperatingSystem;
import main.exo13.models.roles.TypeSmartphone;

public class GooglePixel extends Smartphone implements GoogleFunction {

    public GooglePixel(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
        super(typeSmartphone, price, operatingSystem);
    }

    @Override
    public void describeYourself() {
        super.describeYourself();
        System.out.println("Mon modèle me permet aussi "+googler()+"\n");
    }

    public String googler(){
        return "de googler";
    }
}
