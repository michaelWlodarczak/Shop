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

    public String getIdOfProduct() {
        return IdOfProduct;
    }

    public void setIdOfProduct(String idOfProduct) {
        IdOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product {" +
                "Id = " + IdOfProduct +
                ", name = " + nameOfProduct +
                ", price = " + priceOfProduct +
                ", product category = " + productCategory +
                '}';
    }
}

