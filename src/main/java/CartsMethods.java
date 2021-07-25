import java.util.Map;

public interface CartsMethods {

    void addItemsIntoCart(Product product, int quantity);

    double calculateFinalPrice();

    public void displayStorage(Map<Product, Integer> storageMap);

}
