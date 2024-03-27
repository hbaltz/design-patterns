package iterator.menu.diner;

import iterator.Iterator;
import iterator.menu.diner.iterator.DinerMenuIterator;
import iterator.menu.menu_item.MenuItem;

import java.util.ArrayList;

/**
 * The menu of a diner restaurant
 */
public class DinerMenu {
    /**
     * The diner want the max size of his menu
     * We don't want more than MAX_ITEMS items in his menu
     */
    private static final int MAX_ITEMS = 6;

    /**
     * The current number of items on the menu
     */
    private int numberOfItems = 0;

    private final MenuItem[] menuItemArray;

    public DinerMenu() {
        menuItemArray = new MenuItem[MAX_ITEMS];

        addItem(
                "Cheeseburger",
                "Juicy beef patty topped with cheese",
                false,
                9.99)
        ;
        addItem(
                "BLT Sandwich",
                "Classic bacon, lettuce, and tomato sandwich",
                true,
                8.49)
        ;
        addItem(
                "Chicken Caesar Salad",
                "Grilled chicken breast on a bed of fresh romaine lettuce",
                false,
                10.99
        );
        addItem(
                "Hot Dog",
                "Grilled hot dog served with mustard and ketchup",
                false,
                6.99
        );
    }

    public void addItem(
            String name,
            String description,
            boolean vegetarian,
            double price
    ) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to the menu");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItemArray[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItemArray);
    }

    // Other method (example : editItem, removeItem)
}
