package nlbudemy.proj1.models;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


//prototype beans are created for each instance called unlike singleton
//prototype beans do not execute destroy codes as it is not managed by
//spring. prototypes are created and then completely handed over to
//client which have to handle the whole bean and cleanup
//prototypes are lazy by default
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) 
public class CricketCoach implements Coach{

    @Override
    public String getDailyWork() {
        return "CricketCoach";
    }
    
    @PostConstruct
    public void start(){
        System.out.println("STARTING CRICKET BEAN");

    }

    @PreDestroy
    public void end(){

        System.out.println("DESTROY CRICKET BEAN");
    }

}
