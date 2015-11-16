package hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GreetingsController {

    @Autowired
    private GreetingsService greetingsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String performGreeting() {
        return greetingsService.getRandomGreeting();
    }

}
