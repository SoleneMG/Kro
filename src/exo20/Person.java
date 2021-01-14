package exo20;
import java.io.Serializable;

public class Person implements Serializable{
    public final String name;
    public final String firstname;
    public final int age;

    public Person(String name, String firstname, int age) {
        this.name = name;
        this.firstname = firstname;
        this.age = age;
    }

    public String desribeYourself(){
        return "Name : "+name+"\nPrénom : "+firstname+"\nAge : "+age+" ans";
    }
}
