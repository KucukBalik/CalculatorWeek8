import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void Setup()
    {
        myCalc = new Calculator();
    }
    @Test
    void testAddSuccess()
    {
        assertEquals(8, myCalc.add(4,4));
    }

    void testAddFailure()
    {
        assertTh
    }
}
