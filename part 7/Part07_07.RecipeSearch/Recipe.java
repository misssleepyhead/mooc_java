
import java.util.ArrayList;


public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name,int time, ArrayList<String> ingredients ) {
        this.name = name;
        this.time= time;
        this.ingredients = ingredients;
        
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
       return this.getName() + ", cooking time: " + this.getTime();
    }
    
    public void printIng(){
    for(String i:this.ingredients){
        System.out.println(i);
    
    }
    
    
    }
    
}
