package nl.fontys.coffeemachine.components;

import nl.fontys.coffeemachine.util.NoResourcesException;
import org.springframework.stereotype.Component;

/**
 * A component of a coffee machine that can store and give water.
 */
@Component
public class WaterContainer {
    
    private int water;
    
    public WaterContainer() {
        water = 2000;
    }

    public int getWater(int ml) {
        water -= ml;
        
        if (water >= 0) {
            return ml;
        } else {
            water = 0;
            throw new NoResourcesException("Not enough water available for this coffee");
        }
    }
}