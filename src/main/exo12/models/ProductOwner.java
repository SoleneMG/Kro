package main.exo12.models;

import main.exo12.models.role.Manage;

public class ProductOwner extends Employee implements Manage {

    public ProductOwner(Factory factory) {
        super(factory);
    }

    @Override
    public void describeYourSelf() {
        System.out.print("Je suis un PO");
        super.describeYourSelf();
        System.out.println(manage());
    }

    public String manage() {
        return "je manage du personnel.\n";
    }
}
