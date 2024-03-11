package strategy.duck.behavior.fly;

/**
 * Defines what is the behavior to fly with wings
 */
public class FlyBehaviorWithWings implements IFlyBehavior {
    public void fly() {
        System.out.println("T'm flying using my wings!");
    }
}
