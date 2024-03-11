package strategy.duck.behavior.fly;

/**
 * Defines the no fly behavior
 */
public class NoFlyBehavior  implements IFlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
