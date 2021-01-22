package exo22.models;

public class Menu {
    final Dish dish;
    final Side side;
    final Drink drink;

    public Menu(Dish dish, Side side, Drink drink) {
        this.dish = dish;
        this.side = side;
        this.drink = drink;
    }

    public StringBuilder givenMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Vous avez choisi comme menu : ").append(dish.name);
        menu.append("\nVous avez choisi comme accompagnement : ").append(side.name);
        if (this.drink != null) {
            menu.append("\nVous avez choisi comme boisson : ").append(drink.name);
        }
        return menu;
    }


}
