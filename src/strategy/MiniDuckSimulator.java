package strategy;

import strategy.duck.DecoyDuck;
import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
    }
}
