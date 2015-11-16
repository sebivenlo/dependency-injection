package nl.fontys.coffeemachine.components;

import nl.fontys.coffeemachine.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A service that handles requests for coffee. It works like a coffee blender.
 */
@Component
public class CoffeeMachineService {
    
    @Autowired
    private BeanGrinder beanGrinder;
    
    @Autowired
    private WaterHeater waterHeater;

    public Coffee getOneCoffee() {
        Coffee result = new Coffee();
        
        result.setWater(waterHeater.getHotWater(200));
        result.setBeans(beanGrinder.getGrindedBeans(20));
        result.setSugar(7);
        result.setMilk(80);
        
        return result;
    }
}