package restaurant;

public class ServeOrderRunnable implements Runnable {

    private final Restaurant rest;

    public ServeOrderRunnable(Restaurant rest) {
        this.rest = rest;
    }

    @Override
    public void run() {
        System.out.println("Serving order: " + rest.getNextMeal() + "\n");
    }

}
