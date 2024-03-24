package adapter;

import adapter.duck.IDuck;
import adapter.duck.MallardDuck;
import adapter.duck.adapter.TurkeyAdapter;
import adapter.turkey.ITurkey;
import adapter.turkey.WildTurkey;
import adapter.turkey.adapter.DuckAdapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        IDuck turkeyAdapter = new TurkeyAdapter(turkey);

        ITurkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe turkey adapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("\nThe duck adapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
