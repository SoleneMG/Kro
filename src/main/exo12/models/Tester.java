package main.exo12.models;

import main.exo12.models.role.Fix;

public class Tester extends Employee implements Fix {

    public Tester(Factory factory) {
        super(factory);
    }

    @Override
    public void describeYourSelf() {
        System.out.print("Je suis un testeur");
        super.describeYourSelf();
        System.out.println(fix());
    }

    public String fix() {
        return "j'aide les développeurs à réparer des bugs.\n";
    }
}
