
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);

    }

    public void clear() {
        this.history.clear();

    }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double result = 0;

        for (Double h : history) {
            if (h > result) {
                result = h;
            }
        }
        return result;
    }

    public double minValue() {
        double result = this.history.get(0);

        for (Double h : history) {
            if (h < result) {
                result = h;
            }
        }
        return result;
    }

    public double average() {
        double avg = 0;
        for (Double h : history) {
            avg += h;
        }
        avg = avg / this.history.size();
        return avg;
    }
}
