import java.util.HashMap;
import java.util.Map;

public class Storage implements RecordOfGoods {
    public static  Map<Product, Integer> productStorage = new HashMap<>();
public Product product;
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
    public void removeProductFromStorage(String name, int quantity) {

        if (productStorage.keySet().contains(product.getNameOfProduct ().equals (name))) {
            if (productStorage.get(product) - quantity < 0) {
                System.out.println("Not enough items inside storage. Available products inside storage: " + productStorage.get(product));
            } else {
                productStorage.put(product, productStorage.get(product) - quantity);
            }
        } else {
            System.out.println("No product inside storage");
        }
        System.out.println(productStorage.size());
    }

    public Map<Product,Integer> getStorage(){
        return productStorage;
    }
}

