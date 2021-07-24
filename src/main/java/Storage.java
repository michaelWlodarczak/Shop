import java.util.HashMap;
import java.util.Map;

public class Storage implements RecordOfGoods{
    Map<Product,Integer> productStorage = new HashMap<>();

    @Override
    public void putProductIntoStorage(Product product, int quantity) {
        for (Product product1 : productStorage.keySet())
            if (product1.equals(product)){
                productStorage.put(product,productStorage.get(product)+quantity);
            }else {
                productStorage.put(product,quantity);
            }
    }

    @Override
    public void removeProductFromStorage() {

    }
}
