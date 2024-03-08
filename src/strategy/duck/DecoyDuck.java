package strategy.duck;

import strategy.duck.behavior.fly.NoFlyBehavior;
import strategy.duck.behavior.quack.NoQuackBehavior;

/**
 * Modeled a mallard duck
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("The decoy duck is a lifelike imitation used to attract waterfowl during hunting expeditions");
    }
}
