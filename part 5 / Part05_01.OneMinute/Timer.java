public class Timer {

    private ClockHand seconds;
    private ClockHand hundredseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredseconds = new ClockHand(100);

    }

    public void advance() {
        this.hundredseconds.advance();

        if (this.hundredseconds.value() == 0) {
            this.seconds.advance();
        }

    }

    public String toString() {
        return seconds + ":" + hundredseconds;

    }
}
