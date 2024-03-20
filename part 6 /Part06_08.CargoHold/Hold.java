
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> holds = new ArrayList<>();

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;

    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            holds.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase c : holds) {
            total += c.totalWeight();

        }
        return total;
    }

    public String toString() {

        return holds.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase s : holds) {
            s.printItems();

        }

    }
}
