package iterator.menu.waitress;

import iterator.Iterator;
import iterator.menu.diner.DinerMenu;
import iterator.menu.menu_item.MenuItem;
import iterator.menu.pancake_house.PancakeHouseMenu;

/**
 * Modeled a waitress in a restaurant that is composed of a pancake house and a diner
 */
public class Waitress {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("BREAKFAST");
        printSeparator();
        printMenuViaIterator(pancakeIterator);
        System.out.println("\nLUNCH");
        printSeparator();
        printMenuViaIterator(dinerIterator);
    }

    private void printMenuViaIterator(Iterator<MenuItem> menuItemIterator) {
        while (menuItemIterator.hasNext()) {
            MenuItem menuItem = menuItemIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
            printSeparator();
        }
    }

    private void printSeparator() {
        System.out.println("----------------------");
    }
}
