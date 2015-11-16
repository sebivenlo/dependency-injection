package restaurant;

public class ServeOrderRunnable implements Runnable {

    @Autowired
    private final Restaurant rest;

    public ServeOrderRunnable() {
        // Became useless
    }

    @Override
    public void run() {
        System.out.println("Order: " + rest.getNextMeal() + "\n");
    }

}
