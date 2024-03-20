
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();
//    private int total;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;

    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            items.add(item);
//            total += item.getWeight();
        }
    }

    public String toString() {
        String result = "";
        if (items.size() == 0) {
            result = "no items (0 kg)";
        } else if (items.size() == 1) {
            result = "1 item (" + this.totalWeight() + " kg)";

        } else {
            result = items.size() + " items(" + this.totalWeight() + " kg)";
        }
        return result;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");

        }

    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();

        }
        return total;
    }

    public Item heaviestItem() {
        Item h = new Item("", 0);
        if (items.size() == 0) {
            h = null;
        }

        for (Item item : items) {
            if (item.getWeight() > h.getWeight()) {
                h = item;
            }

        }
        return h;
    }

}
