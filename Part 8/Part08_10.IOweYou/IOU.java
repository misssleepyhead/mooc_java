
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> map;

    public IOU() {
        this.map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        double result = 0;
        for (String p : this.map.keySet()) {
            if (p.equals(toWhom)) {
                result = this.map.getOrDefault(p, 0.0);
            }

        }
        return result;

    }

}
