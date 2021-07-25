import java.util.HashMap;
import java.util.Map;

public class Shop extends Storage implements CartsMethods {

    Map<Product, Integer> shopCart = new HashMap<>();

    @Override
    public void addItemsIntoCart(Product product, int quantity) {
        if (getStorage().keySet().contains(product)) {
            if (productStorage.get(product) - quantity < 0) {
                System.out.println("Not enough items inside storage. Available products inside storage: " + productStorage.get(product));
            } else {
                shopCart.put(product, quantity);
            }
        } else {
            System.out.println("Sorry! We dont have this item");
        }
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = 0;
        for (Product product : shopCart.keySet()) {
            double price = product.getPriceOfProduct() * shopCart.get(product);
            finalPrice += price;
        }
        return finalPrice;
    }

    public void displayStorage(Map<Product,Integer> storageMap) {
        for (Map.Entry<Product, Integer> pair : storageMap.entrySet()) {
            System.out.println("Name: " + pair.getKey() + "; Remain quantity: " + pair.getValue());
        }
    }
}
