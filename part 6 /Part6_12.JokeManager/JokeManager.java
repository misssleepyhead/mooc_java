
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
    }

    public void addJoke(String joke) {
        jokes.add(joke);

    }

    public String drawJoke() {

        String output = "";
        if (jokes.isEmpty()) {
            output = "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            output = jokes.get(index);

        }
        return output;
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }

    }
}
