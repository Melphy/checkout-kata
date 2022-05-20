package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductPriceTest {

    @Test
    void calculatePrice() {
        ProductPrice productA = new ProductPrice("A", 5);

        int total = productA.calculatePrice(1);

        assertThat(total).isEqualTo(5);
    }
}