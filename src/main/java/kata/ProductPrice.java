package kata;

public record ProductPrice(String product, int price, SpecialPrice specialPrice) {

    public ProductPrice(String product, int price) {
        this(product, price, new SpecialPrice(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    public int calculatePrice(int quantity) {
        int specialAmount = quantity / specialPrice.quantity();
        return specialAmount * specialPrice.price() + (quantity - specialAmount * specialPrice.quantity()) * price;
    }
}
