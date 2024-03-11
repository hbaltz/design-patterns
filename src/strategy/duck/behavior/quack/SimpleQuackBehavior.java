package strategy.duck.behavior.quack;

/**
 * Defines simple quack behavior
 */
public class SimpleQuackBehavior implements IQuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
