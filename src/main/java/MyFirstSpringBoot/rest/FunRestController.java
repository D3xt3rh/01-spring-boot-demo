package MyFirstSpringBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {

        return "Hello World";
    }
    @GetMapping("/workout")
    public String doWorkout() {
        return "Run Saalim Run";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day";
    }

}
