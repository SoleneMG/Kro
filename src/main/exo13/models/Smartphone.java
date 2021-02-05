package main.exo13.models;

import main.exo13.models.roles.IOS;
import main.exo13.models.roles.OSAndroid;
import main.exo13.models.roles.OperatingSystem;
import main.exo13.models.roles.TypeSmartphone;

public abstract class Smartphone implements IOS, OSAndroid {
    public final TypeSmartphone typeSmartphone;
    public final float price;
    final OperatingSystem operatingSystem;

    public Smartphone(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
        this.typeSmartphone = typeSmartphone;
        this.price = price;
        this.operatingSystem = operatingSystem;
        }

    public String call(){
        return "appel";
    }

    public void describeYourself(){
        System.out.println("Je suis un "+typeSmartphone.name()+" j'ai une fonction "+call());

        if (operatingSystem.equals("IOS")){
            System.out.println("Mon système d'exploitation est "+operatingSystem+" il me permet "+puffUp()+" et "+display()+".");
        } else
            System.out.println("Mon système d'exploitation est "+operatingSystem+" il me permet "+play()+" et "+display()+".");
    }

    @Override
    public String display() {
        return "d'afficher";
    }
    @Override
    public String puffUp() {
        return "d'entuber";
    }
    @Override
    public String play() {
        return "de jouer";
    }

}
