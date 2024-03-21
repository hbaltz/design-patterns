package abstract_factory.ingredient.dough;

/**
 * Modeled a pizza dough
 */
public interface IDough {
    /**
     * @return the type of the dough
     */
    public String getType();

    /**
     * @return the thickness of the dough in inch
     */
    public double getThickness();

    /**
     * @return true if the dough is gluten free, false else
     */
    public boolean isGlutenFree();
}
