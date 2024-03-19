
public class Item {

    private String name;
    private String id;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public boolean equals(Object i) {
        if (this == i) {
            return true;
        }
        if (!(i instanceof Item)) {
            return false;
        }

        Item compared = (Item) i;
        
        if (this.id.equals(compared.id)){
        return true;
        
        }
        return false;

    }

    public String toString() {
        return this.id + ": " + this.name;
    }

}
