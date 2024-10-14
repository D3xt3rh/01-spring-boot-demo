package MyFirstSpringBoot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    //inject properties for: coach name and team name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ",Team Name:"  + teamName;
    }

    // expose new endpoint for "/" which return below message
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
