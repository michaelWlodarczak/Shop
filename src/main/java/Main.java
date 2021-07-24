import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> products = new HashMap<>();
        products.put("jabłko", "2");
        products.put("gruszka", "6");
        products.put("winogrona","10");
        products.put("cytryna","15");


        // iterowanie po kluczach
        for (String product : products.keySet()) {
            System.out.println(product);
        }
        // iterowanie po wartosciach
        for (String quantity : products.values()) {
            System.out.println(quantity);
        }
        // iterowanie po parach
        for (Map.Entry<String, String> pair: products.entrySet()){
            System.out.println("Product: " + pair.getKey() + "; Quantity: " + pair.getValue());
        }
        System.out.println(products);
    }
}
