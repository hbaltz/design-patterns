package strategy.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.quack.QuackBehavior;

/**
 * Modeled a duck
 */
public abstract class Duck {

    /**
     * Encapsulate the fly behavior
     */
    protected FlyBehavior flyBehavior;
    /**
     * Encapsulate the quack behavior
     */
    protected QuackBehavior quackBehavior;

    /**
     * How the duck is displayed, should print a description of the duck
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * All duck swim in these case we have only one behavior so we don't create class to encapsulate it
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}