
package FlightControl.domain;


public class Flight {
    private Airplane airplane;
    private Place departure;
    private Place target;

    public Flight(Airplane airplane, Place departure, Place target) {
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getTarget() {
        return target;
    }
    
    
    @Override
    public String toString() {
        return this.airplane.toString()+" ("+this.departure+"-"+this.target+")";
    }
    
    
}
