package exo16;

/*Créer une liste de int avec 100 nombres aléatoires entre 0 et 20.
  Créer une autre liste avec les nombres entre 10 et 19 et ordonner en croissant.
 */

import java.util.*;

public class Exercice16 implements Runnable {

    public void run() {
        registerListOfPerson();

    }

    public void registerRandomList() {
        List<Integer> randomInteger = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(21);
            randomInteger.add(number);
            System.out.println(randomInteger.get(i));
        }
        System.out.println("La taille de la liste d'entier aléatoire est : " + randomInteger.size());
    }

    public void registerSortList(List<Integer> randomInteger) {
        List<Integer> sortInteger = new ArrayList();
        for (Integer value : randomInteger) {
            if (value > 9 && value < 20) {
                sortInteger.add(value);
            }
        }
        Collections.sort(sortInteger);
        for (Integer integer : sortInteger) {
            System.out.println(integer);
        }
        System.out.println("La taille de la liste ordonnée est : " + sortInteger.size());
    }

    public void registerListOfPerson() {
        List<Person> personList = new ArrayList();
        Person dupont = new Person("Dupont", "Michel");
        Person tabardel = new Person("Tabardel", "Rémy");
        Person grosjean = new Person("Grosjean", "Solène");
        Person poincelin = new Person("Poincelin", "Violaine");
        personList.add(dupont);
        personList.add(tabardel);
        personList.add(grosjean);
        personList.add(poincelin);
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person person1, Person person2) {
                return (person1).name.compareTo(person2.name);
            }
        });
        Collections.reverse(personList);

        for (Person person : personList) {
            System.out.println(person.name);
        }

        Collections.sort(personList,Person::compareTo);
        for (Person person : personList) {
            System.out.println(person.name+" "+person.firstName+" : "+person.thisLength);
        }
    }

}
