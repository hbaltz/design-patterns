package factory.pizza;

/**
 * Modeled a pizza
 */
public interface IPizza {
    /**
     * Specific preparation method
     */
    public void prepare();

    /**
     * Specific bake method
     */
    public void bake();

    /**
     * Specific cut method
     */
    public void cut();

    /**
     * Specific box method
     */
    public void box();
}
