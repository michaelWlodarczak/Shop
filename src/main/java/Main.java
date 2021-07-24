import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1","apple",3.5,ProductCategory.GROCERIES);
        Product product2 = new Product("2","Domestos",15.5,ProductCategory.CHEMICALS);

        Storage storage = new Storage();
        storage.putProductIntoStorage(product1,5);
        storage.putProductIntoStorage(product2,10);
        storage.productStorage.forEach((k, v) -> System.out.println(k + " " + v));
        storage.putProductIntoStorage(product2,5);
        storage.productStorage.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
