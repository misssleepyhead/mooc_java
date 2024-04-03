
import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> misItem;

    public MisplacingBox() {
        this.misItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misItem.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
       return false;
    }
    
    
    
    

}
