import java.util.Map;

public interface CartsMethods {


    void addItemsIntoCart(String product, int quantity);

    double calculateFinalPrice();

    public void displayStorage(Map<Product, Integer> storageMap);

}
