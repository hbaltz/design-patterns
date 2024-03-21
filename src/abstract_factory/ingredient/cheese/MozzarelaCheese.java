package abstract_factory.ingredient.cheese;

public class MozzarelaCheese implements ICheese {
    @Override
    public String getName() {
        return "Mozzarela";
    }

    @Override
    public String getDescription() {
        return "It's a semi-soft Italian cheese known for its smooth texture and mild, creamy flavor";
    }

    @Override
    public boolean isAged() {
        return false;
    }

    @Override
    public boolean isPasteurized() {
        return true;
    }
}
