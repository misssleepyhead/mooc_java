public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this(0);

    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        this.increase(1);

    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.startValue += increaseBy;
        }
    }

    public void decrease() {
        this.decrease(1);

    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.startValue -= decreaseBy;
        }
    }

    public String toString() {
        return "Value: " + this.startValue;

    }
}
