
import java.util.ArrayList;

public class Herd implements Movable {
    
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
        
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Movable m : this.herd) {
            
            result += m+"\n";
        }
        return result;
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable m : this.herd) {
            m.move(dx, dy);
        }
    }
    
}
