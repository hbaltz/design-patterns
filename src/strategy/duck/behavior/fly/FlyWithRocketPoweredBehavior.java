package strategy.duck.behavior.fly;

/**
 * Defines the behavior to fly with rocker
 */
public class FlyWithRocketPoweredBehavior implements FlyBehavior{
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
