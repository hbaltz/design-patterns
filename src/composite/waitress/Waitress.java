package composite.waitress;

import composite.menu.IMenuComponent;

/**
 * Modeled a waitress in a restaurant that is composed of a pancake house and a diner
 */
public class Waitress {
    private final IMenuComponent menu;

    public Waitress(IMenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu() {
       menu.print();
    }
}
