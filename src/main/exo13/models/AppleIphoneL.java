package main.exo13.models;

import main.exo13.models.roles.Apple_Function;
import main.exo13.models.roles.OperatingSystem;
import main.exo13.models.roles.TypeSmartphone;

public class AppleIphoneL extends Smartphone implements Apple_Function {


    public AppleIphoneL(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
        super(typeSmartphone, price, operatingSystem);
    }

    @Override
    public void describeYourself() {
        super.describeYourself();
        System.out.println("Mon modèle me permet aussi "+pommer()+"\n");
    }

    @Override
    public String pommer() {
        return "de pommer";
    }
}
