
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> boxOne;
    

    public OneItemBox() {
        this.boxOne = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (boxOne.isEmpty()) {
            boxOne.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return boxOne.contains(item);
    }

}
