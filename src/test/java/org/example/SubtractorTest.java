package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtractorTest {
    private IAdder adder;
    private IFlipper flipper;
    private Subtractor subtractor;

    @BeforeEach
    public void setUp() {
        adder = new Adder();
        flipper = new Flipper();
        subtractor = new Subtractor(adder, flipper);
    }

    @Test
    public void testSubtract() {
        assertEquals(-2, subtractor.subtract(3, 5));
        assertEquals(8, subtractor.subtract(10, 2));
        assertEquals(0, subtractor.subtract(5, 5));
    }
}
