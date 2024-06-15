package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DividerTest {
    private IDivider divider;

    @BeforeEach
    public void setUp() {
        divider = new Divider();
    }

    @Test
    public void testDivide() {
        // Test cases for normal division
        assertEquals(2, divider.divide(6, 3));
        assertEquals(-4, divider.divide(12, -3));
        assertEquals(0, divider.divide(0, 5));

        // Test case for division by zero (expecting ArithmeticException)
        assertThrows(ArithmeticException.class, () -> divider.divide(10, 0));
    }
}
