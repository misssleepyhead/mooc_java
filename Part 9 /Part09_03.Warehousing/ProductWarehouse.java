
public class ProductWarehouse extends Warehouse {

    private String productName;
    // private double capacity;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;

    }

    public void setName(String newName)  {
        this.productName = newName;
    }
    
    public String getName() {
        return this.productName;

    }

    @Override
    public String toString() {
        return this.productName+": "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
