package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private int number;
    private boolean on;

    public TemperatureSensor() {
        this.on = false;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalArgumentException("off");

        }

        Random random = new Random();
        int randomNumber = random.nextInt(61) - 30;

        return randomNumber;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

}
