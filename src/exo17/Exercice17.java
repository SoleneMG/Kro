package exo17;

import java.util.*;

/*
Faire une liste avec des bouteilles de lait et des bouteilles de jus d'orange d'1l et de 2l
Ordonner les bouteilles de lait de 2l puis bouteille de lait de 1l, orange 2l, orange 1l

 */
public class Exercice17 implements Runnable{
    @Override
    public void run() {
        List list = registerListOfDrink();
        System.out.println("Liste à la con : ");
        displayList(list);
        sortList(list);
        System.out.println("\n"+ "Liste rangée dans l'ordre de mon chéri d'amOooooour : ");
        displayList(list);

    }

   public List<Drink> registerListOfDrink(){
       OrangeBottle orangeBottle1 = new OrangeBottle(1);
       OrangeBottle orangeBottle2 = new OrangeBottle(2);
       OrangeBottle orangeBottle3 = new OrangeBottle(2);
       OrangeBottle orangeBottle4 = new OrangeBottle(1);
       MilkBottle milkBottle1 = new MilkBottle(1);
       MilkBottle milkBottle2 = new MilkBottle(2);
       MilkBottle milkBottle3 = new MilkBottle(1);
       MilkBottle milkBottle4 = new MilkBottle(2);

       List<Drink> listDrink = new ArrayList<>();
       listDrink.add(orangeBottle1);
       listDrink.add(orangeBottle2);
       listDrink.add(orangeBottle3);
       listDrink.add(orangeBottle4);
       listDrink.add(milkBottle1);
       listDrink.add(milkBottle2);
       listDrink.add(milkBottle3);
       listDrink.add(milkBottle4);

       return listDrink;
   }

   public void displayList(List<Drink> list){
       for (Drink drink : list) {
           System.out.println(drink.display());
       }
   }

   /*public void sortList(List<Drink> list){
       List<Drink> newListOfMilkBottle = new ArrayList<>();
       List<Drink> newListOfOrangeBottle = new ArrayList<>();
       for (Drink drink : list) {
          if (drink instanceof MilkBottle){
              newListOfMilkBottle.add(drink);
              sortListByCapacity(newListOfMilkBottle);
          } else {
              newListOfOrangeBottle.add(drink);
              sortListByCapacity(newListOfOrangeBottle);
          }
       }
       list.removeAll(list);
       list.addAll(newListOfMilkBottle);
       list.addAll(newListOfOrangeBottle);
   }*/

    public void sortList(List<Drink> list) throws ConcurrentModificationException {
        try {
            for (Drink drink : list) {
                Collections.sort(list, Drink::compareToType);
            }
        } catch (ConcurrentModificationException e){
           // System.out.println(e.getMessage());
        }
   }
}
