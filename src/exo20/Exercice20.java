package exo20;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercice20 implements Runnable {
    /*
    Créer un fichier txt avec nom : prénom : âge :
    Renseigner les informations correspondantes
    Récupérer les données puis indiquer si l'utilisateur est majeur
     */
    @Override
    public void run() {
        List<Person> personList = createListOfPerson();
        List<Person> personListRead = serialize(personList);
        sortByAge(personListRead);
    }

    public List<Person> createListOfPerson() {
        List<Person> personList = new ArrayList<>();
        Person solene = new Person("GROSJEAN", "Solène", 31);
        Person remy = new Person("TABARDEL", "Rémy", 30);
        Person elena = new Person("TABARDEL", "Elena", 2);
        personList.add(solene);
        personList.add(remy);
        personList.add(elena);
        return personList;
    }

    public List<Person> serialize(List<Person> personList) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./personne.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(personList);

            fileOutputStream.close();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("./personne.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            @SuppressWarnings("unchecked cast")
            List<Person> personListRead = (List<Person>) objectInputStream.readObject();
            for (Person person : personListRead) {
                System.out.println(person.desribeYourself());
            }

            fileInputStream.close();
            objectInputStream.close();
            return personListRead;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void sortByAge(List<Person> personListRead) {
        int ageReference = 18;
        for (Person person : personListRead) {
            int age = person.age;
            if (age >= ageReference) {
                System.out.println(person.firstname + " "+person.name + " a plus de " + ageReference + " ans.");
            } else {
                System.out.println(person.firstname + " "+person.name + " a moins de " + ageReference + " ans.");
            }
        }
    }
}

