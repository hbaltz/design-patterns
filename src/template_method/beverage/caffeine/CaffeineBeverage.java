package template_method.beverage.caffeine;

/**
 * Modeled a caffeine beverage and define how to prepare the recipe
 */
public abstract class CaffeineBeverage {
    /**
     * Prepare the recipe
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * Specific method to brew the beverage
     */
    protected abstract void brew();

    /**
     * Specific method to add condiments to the beverage
     */
    protected abstract void addCondiments();

    /**
     * Boils the water
     */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Pours in cup
     */
    private void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
