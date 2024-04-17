package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.HashMap;
import java.util.Map;

public class FlightControl {
    
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Place> airports;
    private HashMap<String, Flight> flights;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.airports = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String airplaneId, int capacity) {
        this.airplanes.put(airplaneId, new Airplane(airplaneId, capacity));
        
    }
    
    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
    
    public void addFlight(String airplaneId, String depatureid, String targetid) {
        this.airports.putIfAbsent(depatureid, new Place(depatureid));
        this.airports.putIfAbsent(targetid, new Place(targetid));
        
        Airplane airplane = this.getAirplane(airplaneId);
        
        Flight flight = new Flight(airplane, this.airports.get(depatureid), this.airports.get(targetid));
        
        this.flights.put(flight.toString(), flight);
        
    }
    
    public void printAirplanes() {
        for (Airplane a : this.airplanes.values()) {
            System.out.println(a);
            
        }
    }
    
    public void printFlights() {
        for (Flight f : this.flights.values()) {
            System.out.println(f);
        }
        
    }
    
    public void printOneAirplane(String id) {
        for (String a : this.airplanes.keySet()) {
            if (a.equals(id)) {
                System.out.println(this.airplanes.get(id));
            }
            
        }
        
    }
    
}
