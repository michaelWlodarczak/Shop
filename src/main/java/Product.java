public class Product {
    private String IdOfProduct;
    private String nameOfProduct;
    private double priceOfProduct;
    //private double weightOfProduct;
    private ProductCategory productCategory;

    public Product(String idOfProduct, String nameOfProduct, double priceOfProduct, ProductCategory productCategory) {
        IdOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "IdOfProduct='" + IdOfProduct + '\'' +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                ", productCategory=" + productCategory +
                '}';
    }
}

