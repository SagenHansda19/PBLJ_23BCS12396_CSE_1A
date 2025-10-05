
import java.util.HashMap;
import java.util.Map;
import java.util.SimpleTimeZone;

class ProductIDNotFound extends Exception {
    public ProductIDNotFound(String s) {
        super(s);
    }
}

class Store {
    Map<String, Double> products = new HashMap<>();

    public void addProduct(String id, Double price) {
        products.put(id, price);
    }

    public void applyDiscount(String id, int discount) throws ProductIDNotFound, IllegalArgumentException {
        if (discount > 100 || discount < 0)
            throw new IllegalArgumentException("Please give appropriate discount");
        if (products.containsKey(id)) {
            double currPrice = products.get(id);
            double afterPrice = currPrice * discount / 100;
            products.put(id, afterPrice);
        } else {
            throw new ProductIDNotFound("Check the id and try again!!");
        }
    }

    public void displayProducts() {
        System.out.println("Products: " + products);
    }
}

public class Q4_practice {
    public static void main(String[] args) {
        Store s = new Store();
        s.addProduct("P1", 100.0);
        s.addProduct("P2", 200.0);
        s.addProduct("P3", 300.0);
        try {
            s.displayProducts();
            s.applyDiscount("P1", 30);
            s.displayProducts();
            s.applyDiscount("P2", 80);
            s.displayProducts();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
