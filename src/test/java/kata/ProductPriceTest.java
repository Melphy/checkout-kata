package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void calculateSpecialPrice() {
        ProductPrice productA = new ProductPrice(ANY_PRODUCT, 50, new SpecialPrice(3, 130));

        int total = productA.calculatePrice(3);

        assertThat(total).isEqualTo(130);
    }

    @Test
    void calculateSpecialAndExtra() {
        ProductPrice productA = new ProductPrice(ANY_PRODUCT, 50, new SpecialPrice(3, 130));

        int total = productA.calculatePrice(4);

        assertThat(total).isEqualTo(180);
    }

    @Test
    void calculateMultipleSpecialAndExtra() {
        ProductPrice productA = new ProductPrice(ANY_PRODUCT, 50, new SpecialPrice(3, 130));

        int total = productA.calculatePrice(7);

        assertThat(total).isEqualTo(310);
    }
}