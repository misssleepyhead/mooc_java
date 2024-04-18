
package application;


public class StandardSensor implements Sensor {
    private int number;
    //private boolean on;

    public StandardSensor(int number) {
        this.number = number;
        //this.on = true;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOff() {
       return;
    }

    @Override
    public void setOn() {
       return;
    }

    @Override
    public int read() {
        return this.number;
    }
    
    
    
    
    
    
}
