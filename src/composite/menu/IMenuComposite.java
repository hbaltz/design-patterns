package composite.menu;

/**
 * Modeled a menu composite containing IMenuComponent
 */
public interface IMenuComposite extends IMenuComponent {
    public void add(IMenuComponent menuComponent);
    public void remove(IMenuComponent menuComponent);
    public IMenuComponent getChild(int position);
}
