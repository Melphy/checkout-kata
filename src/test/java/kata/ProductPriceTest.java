package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductPriceTest {

    public static final String ANY_PRODUCT = "A";

    @Test
    void calculatePriceForOne() {
        ProductPrice productA = new ProductPrice(ANY_PRODUCT, 5);

        int total = productA.calculatePrice(1);

        assertThat(total).isEqualTo(5);
    }
    @Test
    void calculatePriceForTwoProducts() {
        ProductPrice productA = new ProductPrice(ANY_PRODUCT, 5);

        int total = productA.calculatePrice(2);

        assertThat(total).isEqualTo(10);
    }
}