
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> packing;
    private double  capacity;
    //private double weight;

    public Box(double capacity) {
        this.capacity = capacity;
        this.packing = new ArrayList<>();
        // this.weight = 0;
    }

    public void add(Packable item) {
        if ((this.weight() + item.weight()) < this.capacity) {
            packing.add(item);

        }

    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable p: packing) {
            weight += p.weight();

        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.packing.size() + " items, total weight " + this.weight() + " kg";
    }

}
