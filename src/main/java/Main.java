import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
  
        Product product1 = new Product("1", "apple", 3.5, ProductCategory.GROCERIES);
        Product product2 = new Product("2", "Domestos", 15.5, ProductCategory.CHEMICALS);
        Product product3 = new Product("3", "Head set", 50.0, ProductCategory.ELECTRONICS);
        Storage storage = new Storage();
        storage.putProductIntoStorage(product1, 1000);
        storage.putProductIntoStorage(product2, 100);
        storage.putProductIntoStorage(product3, 10);



        Shop shop = new Shop(storage);
        shop.addItemsIntoCart(product3, 1);
        System.out.println(shop.calculateFinalPrice());


        Shop shop = new Shop();
        shop.addItemsIntoCart(product1, 10);
        shop.addItemsIntoCart(product2, 3);
        shop.addItemsIntoCart(product3, 1);
        System.out.println(shop.calculateFinalPrice());

        shop.displayStorage(storage.getStorage());



    }
}
