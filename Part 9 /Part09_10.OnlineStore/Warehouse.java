
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;


    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);

    }

    public int price(String product) {
        if (!productPrice.containsKey(product)) {
            return -99;
        }
        return productPrice.get(product);

    }

    public int stock(String product) {
        if (!productStock.containsKey(product)) {
            return 0;

        }
        return productStock.get(product);

    }

    public boolean take(String product) {
        if (this.stock(product) >= 1) {
            productStock.put(product, productStock.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String p : this.productPrice.keySet()) {
            set.add(p);
        }
        return set;
    }
}
