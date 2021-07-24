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
        for (String names : products.keySet()) {
            System.out.println(names);
        }
        // iterowanie po wartosciach
        for (String job : products.values()) {
            System.out.println(job);
        }
        // iterowanie po parach
        for (Map.Entry<String, String> pair: products.entrySet()){
            System.out.println("Produkt: " + pair.getKey() + "; Ilosc " + pair.getValue());
        }
        System.out.println(products);
    }
}
