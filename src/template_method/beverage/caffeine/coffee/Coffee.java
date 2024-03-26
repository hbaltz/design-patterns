package template_method.beverage.caffeine.coffee;

import template_method.beverage.caffeine.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Modeled a filter coffee with sugar and milk
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return askCustomerCondiments();
    }

    private boolean askCustomerCondiments() {
        boolean answer = true; // (default behavior for condiments)

        System.out.println("Would you like milk and sugar with your coffee (Y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";
        try {
            inputString = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read answer");
        }

        if (inputString.toLowerCase().startsWith("n")) {
            answer = false;
        }

        return answer;
    }
}
