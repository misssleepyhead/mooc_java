
package FlightControl.domain;


public class Airplane {
    private String airplaneID;
    private int capacity;

    public Airplane(String airplaneID, int capacity) {
        this.airplaneID = airplaneID;
        this.capacity = capacity;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return this.getAirplaneID()+" ("+this.getCapacity()+" capacity)";
    }
    
    
}
