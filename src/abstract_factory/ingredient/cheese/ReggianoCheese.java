package abstract_factory.ingredient.cheese;

public class ReggianoCheese implements ICheese {
    @Override
    public String getName() {
        return "Reggiano Cheese";
    }

    @Override
    public String getDescription() {
        return "It's a hard, granular cheese that originates from the regions of Parma";
    }

    @Override
    public boolean isAged() {
        return true;
    }

    @Override
    public boolean isPasteurized() {
        return false;
    }
}
