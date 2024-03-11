package strategy.duck.behavior.quack;

/**
 * Defines no quack behavior
 */
public class NoQuackBehavior implements IQuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
