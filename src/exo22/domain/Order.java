package exo22.domain;

import exo22.models.Dish;
import exo22.models.Drink;
import exo22.models.Menu;
import exo22.models.Side;
import exo9.MyScanner;

import java.util.ArrayList;
import java.util.List;

public class Order {
    MyScanner sc = new MyScanner(System.in);

    public List<Menu> orderAMenu(int numberOfMenu) {
        List<Menu> menuList = new ArrayList<>();
        for (int i = 0; i < numberOfMenu; i++) {
            Dish dish = getDish(sc);
            Side side = getSide(dish, sc);
            Drink drink = getDrink(dish, sc);
            menuList.add(new Menu(dish, side, drink));
        }
        return menuList;
    }

    public int howManyOrderMenu() {
        int numberOfMenu = sc.returnInt("Combien de menu souhaitez-vous commander ?");
        boolean isTrue = false;
        if (numberOfMenu <2) {
            isTrue = sc.returnBoolean("Vous souhaitez commander " + numberOfMenu + " menu ? \n - oui \n - non");
        } else {
            isTrue = sc.returnBoolean("Vous souhaitez commander " + numberOfMenu + " menus ? \n - oui \n - non");
        }
        if (isTrue) return numberOfMenu;
        else return howManyOrderMenu();
    }

    public Dish getDish(MyScanner sc) {
        StringBuilder dish = new StringBuilder("Choix menu :");
        Dish chicken = new Dish("poulet");
        Dish beef = new Dish("boeuf");
        Dish vegetarian = new Dish("végétarien");
        List<Dish> dishList = new ArrayList<>();
        dishList.add(chicken);
        dishList.add(beef);
        dishList.add(vegetarian);

        // on parcourt la liste des plats
        for (int i = 0; i < dishList.size(); i++) {
            dish.append("\n").append(i + 1).append(" - ").append(dishList.get(i).name);
        }
        // on demande à l'utilisateur de choisir un plat et on retourne la valeur
        int dishChoice = dishChoice(sc, dish);
        switch (dishChoice) {
            case 1:
                return chicken;
            case 2:
                return beef;
            case 3:
                return vegetarian;
        }
        throw new RuntimeException("Valeur inattendue : "+ dishChoice);
    }

    public int dishChoice(MyScanner sc, StringBuilder dish) {
        int dishChoice = sc.returnInt(dish != null ? dish.toString() : null);
        switch (dishChoice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.println("Erreur de saisie, veuillez recommencer");
        }
        return dishChoice(sc, dish);
    }

    public Side getSide(Dish dish, MyScanner sc) {
        StringBuilder side = new StringBuilder("Choix accompagnements :");
        Side freshVegetables = new Side("légumes frais");
        Side fries = new Side("frites");
        Side rice = new Side("riz");
        Side withRice = new Side("avec riz");
        Side withoutRice = new Side("sans riz");
        List<Side> sideList = new ArrayList<>();
        sideList.add(freshVegetables);
        sideList.add(fries);
        sideList.add(rice);
        sideList.add(withRice);
        sideList.add(withoutRice);

        // si le plat choisi est le végétarien : seul les 2 dernier accompagnements sont proposés
        if (dish.name.equals("végétarien")) {
            int j = 0;
            for (int i = 3; i < sideList.size(); i++) {
                side.append("\n").append(j + 1).append(" - ").append(sideList.get(i).name);
                j++;
            }
            // on demande à l'utilisateur de choisir son accompagnement et on retourne la valeur
            int sideChoiceForVegetarian = sideChoiceForVegetarian(sc, side);
            switch (sideChoiceForVegetarian) {
                case 1:
                    return withRice;
                case 2:
                    return withoutRice;
            }
            throw new RuntimeException("Valeur inattendue : "+ sideChoiceForVegetarian);

        } else { // sinon les 3 premiers accompagnements sont proposés
            for (int i = 0; i < sideList.size() - 2; i++) {
                side.append("\n").append(i + 1).append(" - ").append(sideList.get(i).name);
            }
            // on demande à l'utilisateur de choisir son accompagnement et on retourne la valeur
            int sideChoice = sideChoice(sc, side);
            switch (sideChoice) {
                case 1:
                    return freshVegetables;
                case 2:
                    return fries;
                case 3:
                    return rice;
            }
            throw new RuntimeException("Valeur inattendue : "+ sideChoice);
        }
    }

    public int sideChoiceForVegetarian(MyScanner sc, StringBuilder side) {
        int sideChoiceForVegetarian = sc.returnInt(side != null ? side.toString() : null);
        switch (sideChoiceForVegetarian) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                System.out.println("Erreur de saisie, veuillez recommencer");
        }
        return sideChoiceForVegetarian(sc, side);
    }

    public int sideChoice(MyScanner sc, StringBuilder side) {
        int sideChoice = sc.returnInt(side != null ? side.toString() : null);
        switch (sideChoice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.println("Erreur de saisie, veuillez recommencer");
        }
        return sideChoice(sc, side);
    }

    public Drink getDrink(Dish dish, MyScanner sc) {
        StringBuilder drink = new StringBuilder("Choix boisson :");
        Drink water = new Drink("eau plate");
        Drink sparklingWater = new Drink("eau gazeuse");
        Drink soda = new Drink("soda");
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(water);
        drinkList.add(sparklingWater);
        drinkList.add(soda);

        if (dish.name.equals("boeuf")) {
            // pas de boisson dans le menu boeuf
            return null;
        } else {
            for (int i = 0; i < drinkList.size(); i++) {
                drink.append("\n").append(i + 1).append(" - ").append(drinkList.get(i).name);
            }
            // on demande à l'utilisateur de choisir sa boisson et on retourne la valeur
            int drinkChoice = drinkChoice(sc, drink);
            switch (drinkChoice) {
                case 1:
                    return water;
                case 2:
                    return sparklingWater;
                case 3:
                    return soda;
            }
            throw new RuntimeException("Valeur inattendue : "+ drinkChoice);
        }
    }

    public int drinkChoice(MyScanner sc, StringBuilder drink) {
        int drinkChoice = sc.returnInt(drink != null ? drink.toString() : null);
        switch (drinkChoice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.println("Erreur de saisie, veuillez recommencer");
        }
        return sideChoice(sc, drink);
    }
}



