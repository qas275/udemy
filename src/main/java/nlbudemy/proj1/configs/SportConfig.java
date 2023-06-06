package nlbudemy.proj1.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nlbudemy.proj1.models.Coach;
import nlbudemy.proj1.models.SwimCoach;

@Configuration
public class SportConfig {
    
    //@bean annotation is used to make existing third party class available
    //to be used in spring. 3rd party class source code may not be 
    //available and is not originally configured as a spring bean
    //so cannot use in spring by default
    //hence need to configure and use as a bean so need to import
    //and create the bean here while reading online docs



    //bean id defaults to method name if not qualifier/name found
    @Bean("aqua")
    public Coach swimCoach(){
        return new SwimCoach();
    }


}
