package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplierTest {
    private IMultiplier multiplier;

    @BeforeEach
    public void setUp() {
        multiplier = new Multiplier();
    }

    @Test
    public void testMultiply() {
        // Test cases
        assertEquals(6, multiplier.multiply(2, 3));
        assertEquals(0, multiplier.multiply(5, 0));
        assertEquals(-15, multiplier.multiply(3, -5));
        assertEquals(100, multiplier.multiply(-10, -10));
    }
}
