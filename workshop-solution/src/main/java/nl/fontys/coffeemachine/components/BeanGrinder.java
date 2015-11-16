package nl.fontys.coffeemachine.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A component of a coffee machine that can grind beans.
 */
@Component
public class BeanGrinder {

    @Autowired
    private BeanContainer beanContainer;
    
    public int getGrindedBeans(int g) {
        return beanContainer.getBeans(g);
    }
}
