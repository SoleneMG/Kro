package exo13.models;

import exo13.models.roles.OperatingSystem;
import exo13.models.roles.TypeSmartphone;

public class SamsungNote3 extends Smartphone{
    public SamsungNote3(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
        super(typeSmartphone, price, operatingSystem);
    }

    @Override
    public void describeYourself() {
        super.describeYourself();
        //saut de ligne
        System.out.println("");
    }
}
