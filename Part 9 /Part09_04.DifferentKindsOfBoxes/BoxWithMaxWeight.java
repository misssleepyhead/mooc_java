
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> boxItem;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.boxItem = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        boolean result = false;
        for (Item i : boxItem) {
            if (i.getName().equals(item.getName())) {
                result = true;
            }
        }
        return result;
    }

    public int total() {
        int sum = 0;
        for (Item i : boxItem) {
            sum += i.getWeight();

        }
        return sum;

    }

    @Override
    public void add(Item item) {

        if (total() + item.getWeight() <= this.capacity) {
            this.boxItem.add(item);

        }

    }

}
