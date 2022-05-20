package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Checkout {

    private final List<String> products = new ArrayList<>();
    private final List<ProductPrice> availableProducts = List.of(
            new ProductPrice("A", 50, new SpecialPrice(3, 130)),
            new ProductPrice("B", 30, new SpecialPrice(2, 45)),
            new ProductPrice("C", 20),
            new ProductPrice("D", 15)
    );

    public void add(String... addition) {
        products.addAll(List.of(addition));
    }

    public int total() {
        return availableProducts
                .stream()
                .mapToInt(pp -> pp.calculatePrice(Collections.frequency(products, pp.getProduct())))
                .sum();
    }
}
