
import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {

        recipes.add(recipe);
    }

    public void printList() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);

        }
    }

    public void findName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void findTime(int time) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);

            }
        }

    }

    public void findIng(String ing) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ing)) {
                System.out.println(recipe);

            }
        }

    }

}
