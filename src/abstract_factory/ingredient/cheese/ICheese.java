package abstract_factory.ingredient.cheese;

/**
 * Modeled a cheese
 */
public interface ICheese {
    /**
     * @return the name of the cheese
     */
    public String getName();

    /**
     * @return a description of the cheese
     */
    public String getDescription();

    /**
     * @return true is the cheese is aged, false else
     */
    public boolean isAged();

    /**
     * @return true if the cheese is pasteurized else false
     */
    public boolean isPasteurized();
}


