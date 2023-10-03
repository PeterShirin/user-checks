package com.intellekta.user_checks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
	@Test
    public void testProductIsAvailable() {
        Product product = new Product("Apple", 1.99, 10);
        assertTrue(product.productAvailable());
    }
	
	@Test
    public void testProductIsNotAvailable() {
        Product product = new Product("Banana", 0.99, 0);
        assertFalse(product.productAvailable());
    }
	
	@Test
    public void testSetProductValidPrice() {
        Product product = new Product("Orange", 2.49, 5);
        product.setProductPrice(2.99);
        assertEquals(2.99, product.getProductPrice());
    }
	
	@Test
    public void testSetProductNegativePrice() {
        Product product = new Product("Grapes", 3.99, 8);
        assertThrows(IllegalArgumentException.class, () -> {
            product.setProductPrice(-1.99);
        });
    }
}
