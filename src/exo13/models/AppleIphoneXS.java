package exo13.models;

import exo13.models.roles.Apple_Function;
import exo13.models.roles.OperatingSystem;
import exo13.models.roles.TypeSmartphone;

public class AppleIphoneXS extends Smartphone implements Apple_Function {

    public AppleIphoneXS(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
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
