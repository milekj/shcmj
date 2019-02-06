package milekj.ex7_57;

import org.springframework.stereotype.Component;

@Component("toughCoach")
public class GymCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 10000 push-ups!!!";
    }
}
