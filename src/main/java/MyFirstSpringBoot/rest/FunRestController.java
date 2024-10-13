package MyFirstSpringBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {

        return "Hello World new in this creation";
    }
    @GetMapping("/workout")
    public String doWorkout() {
        return "Run Saalim Run This is a new day and start fresh";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day";
    }

}
