package main.exo22;

import main.exo22.domain.RegisterOrderInFile;
import main.exo22.models.Menu;
import main.exo22.domain.Order;


import java.util.List;

public class Exercice22 implements Runnable {
    @Override
    public void run() {
        Order order = new Order();
        int numberOfMenu = order.howManyOrderMenu();
        List<Menu> menuList = order.orderAMenu(numberOfMenu);
        StringBuilder menu = new StringBuilder();
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println("Menu " +(i+1)+" :");
            menu.append("Menu ").append(i + 1).append(" : ");
            System.out.println(menuList.get(i).givenMenu());
            menu.append("\n");
            menu.append(menuList.get(i).givenMenu());
            menu.append("\n");
        }
        RegisterOrderInFile registerOrderInFile = new RegisterOrderInFile();
        registerOrderInFile.write("./orderMenu", menu);
    }

}

