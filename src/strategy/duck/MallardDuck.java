package strategy.duck;

import strategy.duck.behavior.fly.FlyBehaviorWithWings;
import strategy.duck.behavior.quack.SimpleQuackBehavior;

/**
 * Modeled a mallard duck
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // In the constructor we instantiate the behavior we want for our mallard duck
        flyBehavior = new FlyBehaviorWithWings();
        quackBehavior = new SimpleQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("The mallard duck displays vibrant colors in its green head");
    }
}
