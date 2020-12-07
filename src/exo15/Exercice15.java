package exo15;

/* Créer une liste de int avec 100 nombres aléatoires entre 0 et 20.
Créer une autre liste avec les nombres entre 10 et 19 et ordonner en croissant.
*/


public class Exercice15 implements Runnable{

    public void run() {
        KroList list = new KroList();
        KroMap map = new KroMap();
        String[] board = {"Chien", "Chat", "Lapin", "Renard"};
        int nbElements = 15;

        for(int i = 0; i < nbElements; i++){
            list.add("Number "+i);
        }

        list.remove("Number 6");

        list.addAll(board);

        list.addAll(new String[]{"Je te +", "Tu me +", "Je te + 1000 fois"});
        list.remove("Tu me +");
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.getValue(i));
        }

        for(int i =0;i<nbElements;i++){
            map.put(i, i+0.5);
        }

        for(int i = 0; i < map.getSize(); i++){
            System.out.println(map.getValue(i));
        }

        map.remove(0);
        for(int i = 0; i < map.getSize(); i++){
            System.out.println(map.getValue(i));
        }
    }
}
