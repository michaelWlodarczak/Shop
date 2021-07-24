import java.util.Map;

public interface RecordOfGoods {

    public void putProductIntoStorage(Product product,int quantity);
    public void removeProductFromStorage(Product product, int quantity);
    Map<Product,Integer> getStorage();



}
