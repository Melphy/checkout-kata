package kata;

import com.github.larseckart.tcr.CommitOnGreenExtension;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(CommitOnGreenExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CheckoutTest {

    @Test
    void checkOutOneItem_correctPrice() {
        Checkout shoppingCart = new Checkout();
        shoppingCart.add("A");

        int total = shoppingCart.total();
        assertThat(total).isEqualTo(50);
    }
    @Test
    void checkTwoSameItems_correctPrice() {
        Checkout shoppingCart = new Checkout();
        shoppingCart.add("A","A");

        int total = shoppingCart.total();
        assertThat(total).isEqualTo(100);
    }
    @Test
    void checkoutSpecial_correctPrice() {
        Checkout shoppingCart = new Checkout();
        shoppingCart.add("A","A","A");

        int total = shoppingCart.total();
        assertThat(total).isEqualTo(130);
    }
}
