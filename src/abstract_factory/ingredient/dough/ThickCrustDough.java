package abstract_factory.ingredient.dough;

public class ThickCrustDough implements IDough{
    @Override
    public String getType() {
        return "Pan pizza dough";
    }

    @Override
    public double getThickness() {
        return 1;
    }

    @Override
    public boolean isGlutenFree() {
        return false;
    }
}
