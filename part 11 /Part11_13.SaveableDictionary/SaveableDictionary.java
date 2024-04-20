package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dict;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                this.dict.put(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String s : this.dict.keySet()) {
                String w = s + ":" + this.dict.get(s);
                writer.println(w);

            }
             writer.close();
        }catch(Exception e){
       
                return false;
       
    }

           
            return true;
        }
    

    

    public void add(String words, String translation) {
        this.dict.putIfAbsent(words, translation);
        //this.dict.putIfAbsent(translation, words);

    }

    public String translate(String word) {
        String answer = this.dict.getOrDefault(word, null);
        if (answer == null) {
            for (String s : this.dict.keySet()) {
                if (this.dict.get(s).equals(word)) {
                    answer = s;
                }

            }

        }
        return answer;
    }

    public void delete(String word) {
        this.dict.remove(word);

        for (String s : this.dict.keySet()) {
            if (this.dict.get(s).equals(word)) {
                this.dict.remove(s);
                break;
            }

        }

    }
}
