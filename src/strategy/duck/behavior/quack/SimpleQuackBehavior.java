package strategy.duck.behavior.quack;

/**
 * Defines simple quack behavior
 */
public class SimpleQuackBehavior implements QuackBehavior{
    public void quack() {
        System.out.println("Quack");
    }
}
