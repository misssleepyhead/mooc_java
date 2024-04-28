package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dictionary {

    private List<String> words;
    private Map<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        add("sana", "word");
    }

    // add word/translation 
    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);

    }

    // fetch word
    public String search(String word) {
        return this.translations.get(word);

    }

    // generate random word
    public String randomTest() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));

    }
}
