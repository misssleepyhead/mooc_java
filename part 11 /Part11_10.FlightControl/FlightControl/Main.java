package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.userInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlightControl flightcontrol = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        userInterface ui = new userInterface(flightcontrol, scanner);
        ui.start();
    }
}
