package iterator.waitress;

import iterator.Iterator;
import iterator.menu.IMenu;
import iterator.menu.menu_item.MenuItem;

/**
 * Modeled a waitress in a restaurant that is composed of a pancake house and a diner
 */
public class Waitress {
    private final IMenu breakfastMenu;
    private final IMenu lunchMenu;

    public Waitress(IMenu breakfastMenu, IMenu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> breakfastMenuIterator = breakfastMenu.createIterator();
        Iterator<MenuItem> lunchMenuIterator = lunchMenu.createIterator();
        System.out.println("BREAKFAST");
        printSeparator();
        printMenuViaIterator(breakfastMenuIterator);
        System.out.println("\nLUNCH");
        printSeparator();
        printMenuViaIterator(lunchMenuIterator);
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
