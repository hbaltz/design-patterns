package iterator.menu.pancake_house;

import iterator.Iterator;
import iterator.menu.IMenu;
import iterator.menu.menu_item.MenuItem;
import iterator.menu.pancake_house.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;

/**
 * The menu of the pancake house restaurant
 */
public class PancakeHouseMenu implements IMenu {
    private final ArrayList<MenuItem> menuItemArrayList;

    public PancakeHouseMenu() {
        this.menuItemArrayList = new ArrayList<>();

        // Default item on the menu
        addItem(
                "K&B's pancake breakfast",
                "Pancake with scrambled eggs and toast",
                true,
                2.99
        );
        addItem(
                "Blueberry Pancakes",
                "Delicious pancakes made with fresh blueberries",
                true,
                3.99
        );
        addItem(
                "Banana Walnut Pancakes",
                "Fluffy pancakes with sliced bananas and walnuts",
                true,
                5.49
        );
        addItem(
                "Chocolate Chip Pancakes",
                "Pancakes loaded with chocolate chips",
                true,
                6.19
        );
    }

    public void addItem(
            String name,
            String description,
            boolean vegetarian,
            double price
    ) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemArrayList.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(menuItemArrayList);
    }

    // Other method (example : editItem, removeItem)
}
