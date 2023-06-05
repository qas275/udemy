package nlbudemy.proj1.models;

import org.springframework.stereotype.Component;

// can name beans
@Component("baseball")
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWork() {
        System.out.println("CONSTRUCTING >>>"+ getClass().getSimpleName());
        return "Baseball";
    }
    
}
