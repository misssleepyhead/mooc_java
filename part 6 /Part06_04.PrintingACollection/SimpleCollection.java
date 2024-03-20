
import java.util.ArrayList;

public class SimpleCollection {
    
    private String name;
    private ArrayList<String> elements;
    
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public void add(String element) {
        
        this.elements.add(element);
        
    }
    
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String print1 = "";
        
        String print2 = "";
        
        for (String element : elements)  {
            print2 += "\n" + element;
        }
    

    if (elements.size () 
        == 0) {
            print1 = "The collection " + this.name + " is empty.";
    }

    else if (elements.size () 
        == 1) {
            print1 = "The collection " + this.name + " has " + elements.size() + " element:";
    }

    
        else {
            print1 = "The collection " + this.name + " has " + elements.size() + " elements:";
        
    }
    
    return print1 + print2 ;
}
}
