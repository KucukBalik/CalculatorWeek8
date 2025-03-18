import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void testSubsSuccess()
    {
        assertEquals(0, myCalc.Subs(4,4));
    }

    @Test
    void testDivSuccess()
    {
        assertEquals(2, myCalc.Div(8,4));
    }

    @Test

    void testAddFailure()
    {
       Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.add(Integer.MAX_VALUE, 5);});

       assertEquals("Input is too large", ex.getMessage());

    }

    @Test
    void testSubsFailure()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.Subs(3, 4);});

        assertEquals("Result cant be minus!", ex.getMessage());

    }

    @Test
    void testDivFailure()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()->{myCalc.Div(3, 0);});

        assertEquals("You can not divide anything by zero!", ex.getMessage());

    }
}
