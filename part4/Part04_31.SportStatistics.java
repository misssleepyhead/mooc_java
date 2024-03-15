
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int game_counts = 0;
        int win = 0;
        int lose = 0;

        try ( Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String[] list = line.split(",");
                String team1 = list[0];
                String team2 = list[1];
                int score1 = Integer.valueOf(list[2]);
                int score2 = Integer.valueOf(list[3]);

                if (team1.equals(team)) {
                    game_counts++;
                    if (score1 > score2) {
                        win++;
                    } else {
                        lose++;
                    }
                } else if (team2.equals(team)) {
                    game_counts++;
                    if (score2 > score1) {
                        win++;
                    } else {

                        lose++;
                    }

                }
            }

        } catch (Exception e) {

            System.out.println("Error" + e.getMessage());
        }
        System.out.println("Games: " + game_counts);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);

    }

}
