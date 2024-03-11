package strategy.duck;

import strategy.duck.behavior.fly.IFlyBehavior;
import strategy.duck.behavior.quack.IQuackBehavior;

/**
 * Modeled a duck
 */
public abstract class Duck {

    /**
     * Encapsulate the fly behavior
     */
    protected IFlyBehavior flyBehavior;
    /**
     * Encapsulate the quack behavior
     */
    protected IQuackBehavior quackBehavior;

    /**
     * How the duck is displayed, should print a description of the duck
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * All duck swim in these case we have only one behavior so we don't create class to encapsulate it
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
