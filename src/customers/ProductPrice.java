package customers;

import java.util.HashMap;

/**
 * Created by sumateja on 22/08/20
 *
 * This class contains the store products with price tags.
 */
public class ProductPrice {
    static HashMap<String, Integer> products = new HashMap<>();

    static {
        products.put("potatoes", 45);
        products.put("onions", 15);
    }
}
