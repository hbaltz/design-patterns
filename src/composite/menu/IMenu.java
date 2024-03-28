package composite.menu;

import composite.menu.menu_item.MenuItem;

import java.util.Iterator;

/**
 * Modeled a menu
 */
public interface IMenu {
    public Iterator<MenuItem> createIterator();
}
