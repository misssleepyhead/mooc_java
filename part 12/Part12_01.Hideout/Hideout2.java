// since the exercise said this class only contains one element, i prefer this solution.

import java.util.ArrayList;

public class Hideout<T> {

    private T element;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }

    public T takeFromHideout() {
        T helper = this.element;
        this.element = null;
        return helper;
    }

    public boolean isInHideout() {
        return this.element != null;

    }
}
