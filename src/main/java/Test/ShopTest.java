import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void addItemsIntoCart() {
        Product product = new Product ("1","ops",1,ProductCategory.GROCERIES);
        Storage storage = new Storage ();
        Shop shop = new Shop (storage);
        storage.putProductIntoStorage (product,2);
        shop.addItemsIntoCart ("ops",1);
        Assertions.assertEquals (1,storage.getStorage ().size ());
        Assertions.assertEquals (1,shop.shopCart.size ());
    }
}