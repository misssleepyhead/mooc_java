
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> elements;

    public Pipe() {
        this.elements = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.elements.add(value);
    }

    public T takeFromPipe() {
        T helper = null;
        if (this.elements.size() > 0) {
            helper = this.elements.get(0);
            this.elements.remove(0);
        }
        return helper;
    }
    
    public boolean isInPipe(){
    return this.elements.size()>0;
    
    }
}
