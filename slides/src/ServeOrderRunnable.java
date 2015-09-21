package restaurant;

public class ServeOrderRunnable implements Runnable {

    private final Restaurant hostRestaurant;

    public ServeOrderRunnable(Restaurant hostRestaurant) {
        this.hostRestaurant = hostRestaurant;
    }

    @Override
    public void run() {
        System.out.println("Serving order: " + hostRestaurant.getNextMeal() + "\n");
    }

}
