package kata;

public class ProductPrice {

    private final String product;
    private final int price;

    private final SpecialPrice specialPrice;

    public ProductPrice(String product, int price) {
        this(product, price, new SpecialPrice(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    public ProductPrice(String product, int price, SpecialPrice specialPrice) {
        this.product = product;
        this.price = price;
        this.specialPrice = specialPrice;
    }

    public String getProduct() {
        return product;
    }

    public int calculatePrice(int quantity) {
        int specialAmount = quantity / specialPrice.quantity();
        return specialAmount * specialPrice.price() + (quantity - specialAmount * specialPrice.quantity()) * price;
    }
}
