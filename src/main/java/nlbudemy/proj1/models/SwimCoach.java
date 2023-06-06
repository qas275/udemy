package nlbudemy.proj1.models;

public class SwimCoach implements Coach{
    
    public SwimCoach(){
        System.out.println("SWIM COACH");
    }

    @Override
    public String getDailyWork(){
        return "SWIM";
    } 

}
