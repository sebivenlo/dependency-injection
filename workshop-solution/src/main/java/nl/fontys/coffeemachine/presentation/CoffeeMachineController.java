package nl.fontys.coffeemachine.presentation;

import nl.fontys.coffeemachine.components.CoffeeMachineService;
import nl.fontys.coffeemachine.model.Coffee;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CoffeeMachineController {

    @Autowired
    private CoffeeMachineService coffeeMachineService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Coffee performGreeting() {
        return coffeeMachineService.getOneCoffee();
    }
}