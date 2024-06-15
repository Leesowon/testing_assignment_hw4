package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdderTest {
    @Test
    public void testAdd() {
        Adder adder = new Adder();
        assertEquals(5, adder.add(2, 3));
        assertEquals(-1, adder.add(2, -3));
        assertEquals(0, adder.add(2, -2));
    }
}
