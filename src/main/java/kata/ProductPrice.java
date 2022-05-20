package kata;

public class ProductPrice {

    private final String product;
    private final int price;

    public ProductPrice(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int calculatePrice(int quantity) {
        return quantity * price;
    }
}
