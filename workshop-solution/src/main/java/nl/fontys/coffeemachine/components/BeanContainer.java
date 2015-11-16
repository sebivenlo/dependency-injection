package nl.fontys.coffeemachine.components;

import nl.fontys.coffeemachine.util.NoResourcesException;
import org.springframework.stereotype.Component;

/**
 * The component of a coffee machine that keeps and gives beans.
 */
@Component
public class BeanContainer {
    
    private int beanGrams;
    
    public BeanContainer() {
        beanGrams = 400;
    }

    public int getBeans(int g) {
        beanGrams -= g;
        
        if (beanGrams >= 0) {
            return g;
        } else {
            beanGrams = 0;
            throw new NoResourcesException("Not enough beans available for this coffee");
        }
    }
}