
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> list;

    public Package() {
        this.list = new ArrayList<>();

    }

    public void addGift(Gift gift) {
        list.add(gift);

    }

    public int totalWeight() {
        int weight = 0;

        for (Gift g : list) {

            weight += g.getWeight();
        }
        return weight;
    }
}
