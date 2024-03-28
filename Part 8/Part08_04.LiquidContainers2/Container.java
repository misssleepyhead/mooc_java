
public class Container {

    private int contain;

    public Container() {
        this.contain = 0;
    }

    public int contains() {
        return this.contain;

    }

    public void add(int amount) {
        if (amount > 0) {
            this.contain += amount;

        }
        if (this.contain > 100) {
            this.contain = 100;

        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            this.contain -= amount;
        }
        if (this.contain < 0) {
            this.contain = 0;
        }

    }

    public String toString() {

        return this.contains() + "/100";

    }
}
