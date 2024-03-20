
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        String longest = "";

        if (elements.size() == 0) {
            longest = null;

        }
        for (String e : elements) {
            if (e.length() > longest.length()) {
                longest = e;

            }

        }
        return longest;
    }
}
