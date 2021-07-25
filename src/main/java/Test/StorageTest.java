import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    @Test
    void removeProductFromStorage() {
        Product product = new Product ("1","ops",1,ProductCategory.GROCERIES);
        Storage storage = new Storage ();
        storage.putProductIntoStorage (product,5);
        storage.removeProductFromStorage ("ops",1);
        Assertions.assertEquals (4,storage.getStorage ().get (product));
    }
}