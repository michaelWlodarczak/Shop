import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        String menu = "Menu:\n" +
//                "1.Add product to Shop\n" +
//                "2.Remove product from Shop\n" +
//                "3.Display list of products\n" +
//                "4.Add product to recip\n" +
//                "5.Displey recip\n";
//        final Scanner scanner = new Scanner (System.in);
//        Storage storage = new Storage ();
//        Shop shop = new Shop (storage);
//        while (true) {
//            int number;
//            System.out.println ();
//            System.out.println (menu);
//            number = Integer.valueOf (scanner.nextLine ());
//            switch (number) {
//                case 1:
//                    System.out.println ("Enter product id");
//                    String id = scanner.nextLine ();
//                    System.out.println ("Enter name of Product");
//                    String name = scanner.nextLine ();
//                    System.out.println ("Enter price of product");
//                    Double price = Double.valueOf (scanner.nextLine ());
//                    System.out.println ("Enter type of product(GROCERIES, CHEMICALS, ELECTRONICS");
//                    String type = scanner.nextLine ();
//                    Product prodcut = new Product (id,name,price,(ProductCategory.valueOf (type.toUpperCase(Locale.ROOT).trim ())));
//                    System.out.println ("Number of products");
//                    int count = Integer.valueOf (scanner.nextLine ());
//                    storage.putProductIntoStorage (prodcut,count);
//            }
//        }
        Product product1 = new Product("1", "apple", 3.5, ProductCategory.GROCERIES);
        Product product2 = new Product("2", "Domestos", 15.5, ProductCategory.CHEMICALS);
        Product product3 = new Product("3", "Head set", 50.0, ProductCategory.ELECTRONICS);
        Storage storage = new Storage();
        storage.putProductIntoStorage(product1, 1000);
        storage.putProductIntoStorage(product2, 100);
        storage.putProductIntoStorage(product3, 10);
        //storage.productStorage.forEach((k, v) -> System.out.println(k + " " + v));
//        storage.putProductIntoStorage(product2, 5);
//        storage.productStorage.forEach((k, v) -> System.out.println(k + " " + v));
//        storage.removeProductFromStorage(product1, 5);
//        storage.productStorage.forEach((k, v) -> System.out.println(k + " " + v));
//        storage.removeProductFromStorage(product1, 1);
//        storage.productStorage.forEach((k, v) -> System.out.println(k + " " + v));
        Shop shop = new Shop(storage);
//        shop.addItemsIntoCart(product1, 10);
//        shop.addItemsIntoCart(product2, 3);
        shop.addItemsIntoCart(product3, 1);
        System.out.println(shop.calculateFinalPrice());


    }
}
