
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        if(!this.dict.containsKey(word)){
        this.dict.put(word, new ArrayList<>());
        }
        this.dict.get(word).add(translation);

    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> empty = new ArrayList<>();
        return this.dict.getOrDefault(word, empty);
    }

    public void remove(String word) {
        this.dict.remove(word);

    }

}
