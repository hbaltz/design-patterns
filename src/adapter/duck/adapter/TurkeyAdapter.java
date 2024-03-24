package adapter.duck.adapter;

import adapter.duck.IDuck;
import adapter.turkey.ITurkey;

/**
 * Adapt a turkey to be used as a duck
 */
public class TurkeyAdapter implements IDuck {

    private final ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // Link between quack and gobble is easy
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Because the turkey only flies to short distance
        // We need to call the Turkey's method five time to make up to the Duck fly behavior
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
