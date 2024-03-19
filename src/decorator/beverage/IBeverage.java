package decorator.beverage;

/**
 * Modeled a beverage
 */
public interface IBeverage {
    /**
     * @return the cost of the beverage
     */
    public double cost();

    /**
     * @return the description of the beverage
     */
    public String description();
}
