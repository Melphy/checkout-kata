package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Checkout {

    private final List<String> products = new ArrayList<>();
    private final List<ProductPrice> productPrice = List.of(
            new ProductPrice("A", 50, new SpecialPrice(3, 130)),
            new ProductPrice("B", 30, new SpecialPrice(2, 45)));

    public void add(String... addition) {
        products.addAll(List.of(addition));
    }

    public int total() {
        return productPrice
                .stream()
                .mapToInt(pp -> pp.calculatePrice(Collections.frequency(products, pp.getProduct())))
                .sum();
    }
}
