import java.util.HashMap;
import java.util.Map;

public class Storage implements RecordOfGoods {
    Map<Product, Integer> productStorage = new HashMap<>();

    @Override
    public void putProductIntoStorage(Product product, int quantity) {
        if (productStorage.keySet().contains(product)) {
                productStorage.put(product, productStorage.get(product) + quantity);
            } else {
                productStorage.put(product, quantity);
            }
        System.out.println(productStorage.size());
    }

    @Override
    public void removeProductFromStorage(Product product, int quantity) {
        for (Product product1 : productStorage.keySet())
            if (product1.equals(product)){
                productStorage.remove(product,productStorage.get(product)-quantity);
            }else {
                System.out.println("No product inside storage");
            }
    }
}
