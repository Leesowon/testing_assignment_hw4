import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SubtractorTest {
    private IAdder adder;
    private IFlipper flipper;
    private Subtractor subtractor;

    @BeforeEach
    public void setUp() {
        adder = Mockito.mock(IAdder.class);
        flipper = Mockito.mock(IFlipper.class);
        subtractor = new Subtractor(adder, flipper);
    }

    @Test
    public void testSubtract() {
        Mockito.when(adder.add(3, -5)).thenReturn(-2);
        Mockito.when(flipper.flip(5)).thenReturn(-5);

        assertEquals(-2, subtractor.subtract(3, 5));
    }
}
