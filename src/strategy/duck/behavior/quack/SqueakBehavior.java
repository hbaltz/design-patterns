package strategy.duck.behavior.quack;

/**
 * Define squeak behavior
 */
public class SqueakBehavior implements IQuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
