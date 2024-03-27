package iterator;

import iterator.menu.diner.DinerMenu;
import iterator.menu.pancake_house.PancakeHouseMenu;
import iterator.menu.menu_item.MenuItem;

import java.util.ArrayList;

public class ObjectvilleDinner {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator<MenuItem> breakfastItemIterator = pancakeHouseMenu.createIterator();

        DinerMenu dinerMenu= new DinerMenu();
        Iterator<MenuItem> lunchItemIterator = dinerMenu.createIterator();

        while (breakfastItemIterator.hasNext()) {
            MenuItem breakfastIem = breakfastItemIterator.next();
            System.out.println(breakfastIem.getName() + " ");
            System.out.println(breakfastIem.getPrice() + " ");
            System.out.println(breakfastIem.getDescription());
        }

        while (lunchItemIterator.hasNext()) {
            MenuItem lunchItem = lunchItemIterator.next();
            System.out.println(lunchItem.getName() + " ");
            System.out.println(lunchItem.getPrice() + " ");
            System.out.println(lunchItem.getDescription());
        }
    }
}
