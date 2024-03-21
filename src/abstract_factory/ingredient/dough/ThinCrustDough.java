package abstract_factory.ingredient.dough;

public class ThinCrustDough implements IDough{
    @Override
    public String getType() {
        return "Thin, crispy crust";
    }

    @Override
    public double getThickness() {
        return .125;
    }

    @Override
    public boolean isGlutenFree() {
        return false;
    }
}
