package nl.fontys.coffeemachine.model;

/**
 * Representation of a coffee.
 */
public class Coffee {

    // Amount of used beans
    private int beans;
    
    // Amount of water in ml
    private int water;
    
    // Amount of milk in ml
    private int milk;
    
    // Amount of sugar in grams
    private int sugar;

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return String.format("Coffee: %s beans, %s ml water, %s ml milk, %s g sugar", beans, water, milk, sugar);
    }
}