package adapter.turkey;

public class WildTurkey implements ITurkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying on a short distance");
    }
}
