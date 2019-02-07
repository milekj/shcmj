package milekj.ex9_83;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

@Component
public class RandomFromFileFortuneService implements FortuneService {
    private static String[] fortunes;
    private static String filepath = "milekj/ex9_83/fortunes.txt";
    private Random random;

    public RandomFromFileFortuneService() {
        random = new Random();
    }

    @PostConstruct
    private void initialize() throws IOException{
        System.out.println("In PostConstruct");
        Stream<String> lines = Files.lines(Paths.get(filepath));
        fortunes = lines.toArray(String[]::new);
    }

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
