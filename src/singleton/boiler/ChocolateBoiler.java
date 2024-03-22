package singleton.boiler;

/**
 * Modeled a chocolate boiler for chocolate milk
 */
public class ChocolateBoiler {

    /**
     * True if the boiler is empty false else
     */
    private boolean empty;
    /**
     * True if the content of the boiler is boiled false else
     */
    private boolean boiled;

    private static ChocolateBoiler chocolateBoilerUniqInstance = null;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * We want across your application only one instance of the chocolate-boiler
     * Implementation of 'naive' idea of Singleton pattern
     * This implementation can create several instance of the class during multi-thread look other class in the package
     * to see solution to this problem.
     *
     * @return the uniq instance of the boiler
     */
    public static ChocolateBoiler getInstance() {
        if (chocolateBoilerUniqInstance == null) {
            chocolateBoilerUniqInstance = new ChocolateBoiler();
        }
        return chocolateBoilerUniqInstance;
    }

    /**
     * Fil the boiler only if it's empty
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Fill the boiler with milk/chocolate mixture");
        } else {
            System.out.println("The boiler is already full");
        }
    }

    /**
     * Boil the content of the boiled is it's not empty and not already boiled
     */
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            System.out.println("Bring the content to boil");
            boiled = true;
        } else {
            System.out.println("The content is empty or already boiled");
        }
    }

    /**
     * Drain the boiled milk and chocolate only if the boiler is not empty and the content is boiled
     */
    public void drain() {
        if(!isEmpty() && isBoiled()) {
            System.out.println("Drain the boiled milk and chocolate");
            empty = true;
        } else {
            System.out.println("The boiler can't be drained (empty or content no boiled)");
        }
    }

    /**
     * @return true if the boiler is empty false else
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * @return true if the content of the boiler is boiled false else
     */
    public boolean isBoiled() {
        return boiled;
    }
}
