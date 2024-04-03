
public class TripleTacoBox implements TacoBox {

    private int taco = 3;

    public TripleTacoBox() {
        this.taco = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.taco;
    }

    @Override
    public void eat() {
        this.taco--;
        if (this.taco < 0) {
            this.taco = 0;
        }
    }

}
