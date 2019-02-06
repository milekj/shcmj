package milekj.ex5_42;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private static String[] fortunes = {"Fortune 1", "Fortune 2", "Fortune 3"};
    private Random random;

    public RandomFortuneService() {
        random = new Random();
    }

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
