package exo13.models;

import exo13.models.roles.OperatingSystem;
import exo13.models.roles.TypeSmartphone;

public class SamsungGalaxy5 extends Smartphone {
    public SamsungGalaxy5(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
        super(typeSmartphone, price, operatingSystem);
    }

    @Override
    public void describeYourself() {
        super.describeYourself();
        //saut de ligne
        System.out.println("");
    }
}
