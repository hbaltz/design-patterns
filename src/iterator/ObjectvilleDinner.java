package iterator;

import iterator.menu.diner.DinerMenu;
import iterator.menu.pancake_house.PancakeHouseMenu;
import iterator.menu.waitress.Waitress;


public class ObjectvilleDinner {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu= new DinerMenu();

        Waitress waitress= new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
