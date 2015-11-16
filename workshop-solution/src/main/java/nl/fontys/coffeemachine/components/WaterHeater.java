package nl.fontys.coffeemachine.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A component of a coffee machine that can give heated water.
 */
@Component
public class WaterHeater {

    @Autowired
    private WaterContainer waterContainer;
    
    public int getHotWater(int ml) {
        return waterContainer.getWater(ml);
    }
}