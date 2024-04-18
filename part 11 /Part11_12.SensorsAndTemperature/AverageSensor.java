package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> avgs;

    //private boolean on;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.avgs = new ArrayList<>();
        //this.on = false;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalArgumentException("off");
        }

        int sum = sensors.stream().mapToInt(s -> s.read()).sum();
        int avg = sum / this.sensors.size();
        this.avgs.add(avg);
        return avg;
    }

    @Override
    public boolean isOn() {
        boolean on = false;
        for (Sensor s : this.sensors) {
            if (s.isOn()) {
                on = true;
            } else {
                on = false;
                break;
            }
        }
        return on;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);

    }

    public List<Integer> readings() {
        return this.avgs;
    }
}
