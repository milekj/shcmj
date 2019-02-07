package milekj.ex9_83;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
