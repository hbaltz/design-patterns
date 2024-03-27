package iterator.menu.diner.iterator;

import iterator.Iterator;
import iterator.menu.menu_item.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] itemArray;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] itemArray) {
        this.itemArray = itemArray;
    }


    @Override
    public boolean hasNext() {
        return position < itemArray.length && itemArray[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = itemArray[position];
        position += 1;
        return  menuItem;
    }
}
