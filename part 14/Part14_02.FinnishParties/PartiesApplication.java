package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    private HashMap<String, HashMap<Integer, Double>> values;

    public PartiesApplication() {
        this.values = readFile("partiesdata.tsv");
    }

    private HashMap<String, HashMap<Integer, Double>> readFile(String filename) {
        HashMap<String, HashMap<Integer, Double>> value1 = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();

        try ( Scanner scanner = new Scanner(Paths.get(filename))) {
            String row = scanner.nextLine();
            String[] parts = row.split("\t");
            for (int i = 1; i < parts.length; i++) {
                years.add(Integer.valueOf(parts[i]));
            }
            while (scanner.hasNextLine()) {
                String next = scanner.nextLine();
                String[] parts2 = next.split("\t");
                String party = parts2[0];
                HashMap<Integer, Double> v = new HashMap<>();
                for (int i = 1; i < parts2.length; i++) {
                    if (!parts2[i].equals("-")) {
                        v.put(years.get(i - 1), Double.valueOf(parts2[i]));
                    }
                }
                value1.put(party, v);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
        }

        return value1;
    }

    @Override
    public void start(Stage stage) {

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        //lineChart.setLegendVisible(false);

        this.values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));

            });
            lineChart.getData().add(data);

        });
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
        
        for(int i=0;i<this.values.size();i++){
            System.out.println(this.values.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        launch(PartiesApplication.class);
    }

}
