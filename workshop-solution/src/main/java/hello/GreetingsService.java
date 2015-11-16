package hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Component;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class GreetingsService {

    private static final String[] GREETINGS = new String[] {"Hello", "Dag", "Guten Tag", "Moin", "Hi", "Whazzup", "Goede morgen"};
    
    public String[] getGreetings() {
    	return GREETINGS;
    }
    
    public String getRandomGreeting() {
    	int randomNr = ThreadLocalRandom.current().nextInt(0, GREETINGS.length);
    	return GREETINGS[randomNr];
    }
    
}
