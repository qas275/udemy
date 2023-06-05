package nlbudemy.proj1.models;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWork() {
        return "CricketCoach";
    }
    
    

}
