
import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> element;

    public Hideout() {
        this.element = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if(this.element.size()>0){
        this.element.set(0, toHide);
        }
        this.element.add(toHide);
    }

    public T takeFromHideout() {
        T helper = null;
        if (!this.element.isEmpty()) {
            helper = this.element.get(0);
            this.element.clear();
        }
        return helper;
    }

    public boolean isInHideout() {
        if (this.element.size() > 0) {
            return true;
        }
        return false;

    }
}
