package iterator.menu;

import iterator.Iterator;
import iterator.menu.menu_item.MenuItem;

/**
 * Modeled a menu
 */
public interface IMenu {
    public Iterator<MenuItem> createIterator();
}
