package exo16;

public class Person implements Comparable<Person>{
    final String name;
    final String firstName;
    final int thisLength;

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
        thisLength = this.name.length()+this.firstName.length();
    }


    @Override
    public int compareTo(Person personToCompare) {
        if(personToCompare.thisLength>thisLength){return -1;}
        else if(personToCompare.thisLength<thisLength){return +1;}
        else return 0;
    }
}


