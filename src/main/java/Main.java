import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        String menu = "Menu:\n" +
                "1.Add product to Shop\n" +
                "2.Remove product from Shop\n" +
                "3.Display list of products\n" +
                "4.Add product to recip\n" +
                "5.Displey recip\n";
        final Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        Shop shop = new Shop(storage);
        while (true) {
            int number;
            System.out.println();
            System.out.println(menu);
            number = Integer.valueOf(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.println("Enter product id");
                    String id = scanner.nextLine();
                    System.out.println("Enter name of Product");
                    String name = scanner.nextLine();
                    System.out.println("Enter price of product");
                    Double price = Double.valueOf(scanner.nextLine());
                    System.out.println("Enter type of product(GROCERIES, CHEMICALS, ELECTRONICS");
                    String type = scanner.nextLine();
                    Product prodcut = new Product(id, name, price, (ProductCategory.valueOf(type.toUpperCase(Locale.ROOT).trim())));
                    System.out.println("Number of products");
                    int count = Integer.valueOf(scanner.nextLine());
                    storage.putProductIntoStorage(prodcut, count);

                    break;
                case 2:
                    System.out.println("Enter product name ");
                    String name1 = scanner.nextLine();
                    System.out.println("How many products to remove");
                    int num = Integer.valueOf(scanner.nextLine());
                    storage.removeProductFromStorage(name1, num);
                    break;
                case 3:
                    storage.displayStorage ();
                    break;
                case 4:
                    System.out.println ("Name of product u want to add");
                    String product = scanner.nextLine ();
                    System.out.println ("Amount of products");
                    int nums= Integer.valueOf (scanner.nextLine ());
                    shop.addItemsIntoCart (product,nums);
                    break;
                case 5:
                    System.out.println ("Your Recip:");
                    shop.calculateFinalPrice ();
                    break;
            }
        }
    }
}


