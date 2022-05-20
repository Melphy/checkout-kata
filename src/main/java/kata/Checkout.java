package kata;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private final List<String> products = new ArrayList<>();
    private final List<ProductPrice> productPrice = List.of(new ProductPrice("A", 50));

    public void add(String product) {
        products.add(product);
    }

    public int total() {
        return products
                .stream()
                .mapToInt(product -> productPrice
                        .stream()
                        .filter(pp -> pp.getProduct().equals(product))
                        .findFirst()
                        .get()
                        .calculatePrice(1)) //HardCodedOne :(
                .sum();
    }
}
