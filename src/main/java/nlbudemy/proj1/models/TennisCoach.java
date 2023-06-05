package nlbudemy.proj1.models;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//primary can be used to indicate this is the first implementation of coach to look for if there are multiple beans of coach
//primary has lower priority than qualifier
//lazy initialization will cause this bean to only be created when injection or explicitly requested
@Component
@Primary
@Lazy
public class TennisCoach implements Coach {

    @Override
    public String getDailyWork() {
        return "Tennis";
    }
    
}
