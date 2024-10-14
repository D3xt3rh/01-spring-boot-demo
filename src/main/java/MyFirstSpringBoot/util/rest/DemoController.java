package MyFirstSpringBoot.util.rest;


import MyFirstSpringBoot.util.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define constructor for dependency injection
    private Coach myCoach;

    @Autowired
    public void setCoach(Coach theCoach){
        myCoach =theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
