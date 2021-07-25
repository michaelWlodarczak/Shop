import java.util.HashMap;
import java.util.Map;

public class Shop implements CartsMethods {
    Map<Product, Integer> shopCart = new HashMap<>();
Storage storage;
public Shop(Storage storage){
this.storage=storage;
};


    @Override
    public void addItemsIntoCart(Product product, int quantity) {
        if (storage.getStorage ().keySet ().contains(product)) {
            if (storage.getStorage ().get(product) - quantity < 0) {
                System.out.println("Not enough items inside storage. Available products inside storage: " + storage.productStorage.get(product));
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

}
