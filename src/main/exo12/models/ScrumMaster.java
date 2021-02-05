package main.exo12.models;

import main.exo12.models.role.Manage;

public class ScrumMaster extends Employee implements Manage {

    public ScrumMaster(Factory factory) {
        super(factory);
    }

    @Override
    public void describeYourSelf() {
        System.out.print("Je suis un Scrum Master");
        super.describeYourSelf();
        System.out.println(manage());
    }

    public String manage() {
        return "je manage du personnel selon les dispositions du Scrum.\n";
    }
}
