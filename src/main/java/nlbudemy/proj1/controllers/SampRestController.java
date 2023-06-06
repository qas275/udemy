package nlbudemy.proj1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nlbudemy.proj1.models.Coach;

@RestController
public class SampRestController {
    
    private Coach Coach;
    private Coach anotherCoach;
    private Coach swimCoach;

    //constructor injection
    //to specify a single component can use qualifier with name of class but small case first letter
    //qualifier will overwrite primary annotation as higher priority
    @Autowired
    public SampRestController(@Qualifier("cricketCoach") Coach varCoach, @Qualifier("cricketCoach") Coach anotherCoach2, @Qualifier("aqua") Coach Swimmer){
        Coach = varCoach;
        anotherCoach = anotherCoach2;
        swimCoach = Swimmer;
    }

    //setter injection
    // @Autowired
    // public void setCoach(Coach theCoach){
    //     Coach = theCoach;
    // }

    @Value("${test.var}")
    public String testVar;

    @GetMapping(path = "/")
    public String sayHello(){
        System.out.println(testVar);
        return "HELL0";
    
    }

    @GetMapping("/work")
    public String dailyWork(){
        return Coach.getDailyWork();
    }

    @GetMapping("/check")
    public String check(){
        return "Check >>>"+ (Coach==anotherCoach);
    }
    @GetMapping("/swim")
    public String swim(){
        return swimCoach.getDailyWork();
    }

}
