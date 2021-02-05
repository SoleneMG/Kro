package main.exo12.models;

import main.exo12.models.role.Fix;

public class Dev extends Employee implements Fix {
    public Dev(Factory factory) {
        super(factory);
    }

    @Override
    public void describeYourSelf() {
        System.out.print("Je suis un développeur");
        super.describeYourSelf();
        System.out.println(fix());
    }

    public String fix() {
        return "je répare des bugs.\n";
    }
}
