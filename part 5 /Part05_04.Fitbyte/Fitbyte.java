public class Fitbyte {

    private int age;
    private int restingHeaartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeaartRate = restingHeartRate;

    }

    public double maximumHeartRate(int age) {
        return 206.3 - (0.711 * age);

    }

    public double targetHeartRate(double percentageOfMaximum) {
        
        double maximum = maximumHeartRate(this.age);
        return ((maximum - this.restingHeaartRate)*percentageOfMaximum + this.restingHeaartRate);
    }
}
