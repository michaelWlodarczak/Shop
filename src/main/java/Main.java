import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            String menu = "Menu:\n" +
                    "a.Add product to Shop\n" +
                    "b.Remove product from Shop\n" +
                    "c.Display list of products\n" +
                    "d.Add product to receipt\n" +
                    "e.Display receipt\n" +
                    "f.EXIT";
            final Scanner scanner = new Scanner(System.in);
            Storage storage = new Storage();
            Shop shop = new Shop(storage);
            while (true) {
                //int number;
                String operation;
                System.out.println();
                System.out.println(menu);
                //number = Integer.valueOf(scanner.nextLine());
                operation =
                        scanner.nextLine();

                switch (operation) {
                    case "a":
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
                    case "b":
                        System.out.println("Enter product name ");
                        String name1 = scanner.nextLine();
                        System.out.println("How many products to remove");
                        int num = Integer.valueOf(scanner.nextLine());
                        storage.removeProductFromStorage(name1, num);
                        break;
                    case "c":
                        storage.displayStorage();
                        break;
                    case "d":
                        System.out.println("Name of product u want to add");
                        String product = scanner.nextLine();
                        System.out.println("Amount of products");
                        int nums = Integer.valueOf(scanner.nextLine());
                        shop.addItemsIntoCart(product, nums);
                        break;
                    case "e":
                        System.out.println("Your Recip:");
                        shop.calculateFinalPrice();
                        break;
                    case "f":
                        System.out.println("EXIT");
                        System.exit(-1);
                    default:
                        System.out.println("Invalid value");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}


