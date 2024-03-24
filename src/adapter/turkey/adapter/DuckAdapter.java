package adapter.turkey.adapter;

import adapter.duck.IDuck;
import adapter.turkey.ITurkey;

import java.util.Random;

/**
 * Adapt a duck to be used as a turkey
 */
public class DuckAdapter implements ITurkey {
    private final IDuck duck;
    private final Random random;

    public DuckAdapter(IDuck duck) {
        this.duck = duck;
        this.random = new Random();
    }

    @Override
    public void gobble() {
        // Link between quack and gobble is easy
        duck.quack();
    }

    @Override
    public void fly() {
        // Because the turkey only flies to short distance
        // We need to shorten the duck fly behavior
        // To do that we will make the duck fly one of 5 times
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
