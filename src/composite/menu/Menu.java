package composite.menu;

import java.util.ArrayList;

public class Menu implements IMenuComposite{
    private final ArrayList<IMenuComponent> menuComponentArrayList = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        printSeparator();

        for (IMenuComponent menuComponent : menuComponentArrayList) {
            menuComponent.print();
        }
    }

    @Override
    public void add(IMenuComponent menuComponent) {
        menuComponentArrayList.add(menuComponent);
    }

    @Override
    public void remove(IMenuComponent menuComponent) {
        menuComponentArrayList.remove(menuComponent);
    }

    @Override
    public IMenuComponent getChild(int position) {
        return menuComponentArrayList.get(position);
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void printSeparator() {
        System.out.println("----------------------");
    }
}
