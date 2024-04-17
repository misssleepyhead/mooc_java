package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class userInterface {

    private FlightControl flightcontrol;
    private Scanner scanner;

    public userInterface(FlightControl flightcontrol, Scanner scanner) {
        this.flightcontrol = flightcontrol;
        this.scanner = scanner;
    }

    public void start() {
        this.airportAsset();
        System.out.println();
        this.flightControl();
        System.out.println();

    }

    public void airportAsset() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                addAirplane();

            } else if (input.equals("2")) {
                addFlight();
            }
        }

    }

    public void addAirplane() {
        System.out.println("Give the airplane id: ");
        String airplaneid = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = Integer.valueOf(scanner.nextLine());
        this.flightcontrol.addAirplane(airplaneid, capacity);

    }

    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String airplaneid = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String departureid = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetid = scanner.nextLine();

        this.flightcontrol.addFlight(airplaneid, departureid, targetid);

    }

    public void flightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                this.flightcontrol.printAirplanes();

            } else if (input.equals("2")) {
                this.flightcontrol.printFlights();

            } else if (input.equals("3")) {
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                this.flightcontrol.printOneAirplane(id);

            } else if (input.equals("x")) {
                break;

            }

        }

    }

}
