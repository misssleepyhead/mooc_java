
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate p : this.map.keySet()) {
            if (p.equals(licensePlate)) {
                return false;
            }
        }
        this.map.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.map.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        boolean found = true;
        if (this.map.containsKey(licensePlate)) {
            this.map.remove(licensePlate);

        } else {
            found = false;
        }
        return found;
    }

    public void printLicensePlates() {
        for (LicensePlate p : this.map.keySet()) {
            System.out.println(p);

        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String p : this.map.values()) {
            if (!owners.contains(p)) {
                owners.add(p);
            }

        }

        for (String o : owners) {
            System.out.println(o);
        }
    }

}
