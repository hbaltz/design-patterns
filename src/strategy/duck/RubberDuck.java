package strategy.duck;

import strategy.duck.behavior.fly.NoFlyBehavior;
import strategy.duck.behavior.quack.SqueakBehavior;

/**
 * Modeled a mallard duck
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new SqueakBehavior();
    }

    @Override
    public void display() {
        System.out.println("The rubber duck is a waterproof toy duck typically yellow.");
    }
}
