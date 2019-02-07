package milekj.ex8_75;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

@Component
public class RandomFromFileFortuneService implements FortuneService {
    private static String[] fortunes;
    private static String filepath = "milekj/ex8_75/fortunes.txt";
    private Random random;

    public RandomFromFileFortuneService() throws IOException {
        random = new Random();
        Stream<String> lines = Files.lines(Paths.get(filepath));
        fortunes = lines.toArray(String[]::new);
    }

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
