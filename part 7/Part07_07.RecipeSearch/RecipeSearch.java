
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();
        RecipeBook recipebook = new RecipeBook();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            ArrayList<String> list = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.equals("")) {
                    continue;
                }
                String name = line;
                int time = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String ing = fileScanner.nextLine();
//                    System.out.println(ing);
                    if (ing.isEmpty()) {
                        break;
                    }

                    ingredients.add(ing);
                     list.clear();

                }
                Recipe recipe = new Recipe(name, time, ingredients);
                
                recipebook.add(recipe);               
                    
      
            }
        } catch (Exception e) {

            System.out.println("Error reading file " + e.getMessage());

        }
        UserInterface ui = new UserInterface(scanner, recipebook);
        ui.start();
        
    }

}
