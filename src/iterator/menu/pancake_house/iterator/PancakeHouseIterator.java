package iterator.menu.pancake_house.iterator;

import iterator.Iterator;
import iterator.menu.menu_item.MenuItem;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator<MenuItem> {
    private final ArrayList<MenuItem> menuItemArrayList;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItemArrayList) {
        this.menuItemArrayList = menuItemArrayList;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemArrayList.size() && menuItemArrayList.get(position) != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItemArrayList.get(position);
        position += 1;
        return menuItem;
    }
}
