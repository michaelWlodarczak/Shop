import java.util.HashMap;
import java.util.Map;

public class Shop implements CartsMethods {
    Map<Product, Integer> shopCart = new HashMap<>();
Storage storage;
public Shop(Storage storage){
this.storage=storage;
};


    @Override
    public void addItemsIntoCart(String product, int quantity) {
        if(quantity<=0){
            System.out.println ("U cent add 0 products");
        }else
        for(Product product1: storage.getStorage ().keySet ()){
            if(product1.getNameOfProduct ()==product){

        if (storage.getStorage ().keySet ().contains(product1)) {
            if (storage.getStorage ().get(product1) - quantity < 0) {
                System.out.println ("Not enough items inside storage. Available products inside storage: " + storage.productStorage.get (product));
            }
            else {
                shopCart.put(product1, quantity);
            }if (storage.getStorage ().get (product1)-quantity==0){storage.getStorage ().remove (product1);}
        }} else {
            System.out.println("Sorry! We dont have this item");
        }
    }}

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
