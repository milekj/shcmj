package milekj.ex8_75;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public GymCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 10000 push-ups!!!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
