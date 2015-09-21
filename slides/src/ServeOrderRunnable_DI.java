package restaurant;

public class ServeOrderRunnable implements Runnable {

    @Autowired
    private final Restaurant restaurant;

    public ServeOrderRunnable() {
        // Became useless
    }

    @Override
    public void run() {
        System.out.println("Order: " + restaurant.getNextMeal() + "\n");
    }

}
