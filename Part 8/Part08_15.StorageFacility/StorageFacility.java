
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.facility.containsKey(unit)) {
            this.facility.put(unit, new ArrayList<>());

        }
        this.facility.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> empty = new ArrayList<>();
        return this.facility.getOrDefault(storageUnit, empty);

    }

    public void remove(String storageUnit, String item) {
        // remove one item from given unit
        this.facility.get(storageUnit).remove(item);

        // if no item left then remove unit too
        if (this.facility.get(storageUnit).size() == 0) {
            this.facility.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String u : this.facility.keySet()) {
            units.add(u);

        }
        return units;
    }

}
