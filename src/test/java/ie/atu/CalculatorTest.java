package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setup()
    {
        calc = new Calculator();
    }


    @Test
    public void testAdd_Success()
    {
        assertEquals(4, calc.add(2,2));
    }

    @Test
    public void testSub_Success()
    {
        assertEquals(1, calc.sub(3,2));
    }

    @Test
    public void testMul_Success()
    {
        assertEquals(10, calc.mul(5,2));
    }

    @Test
    public void testDiv_Success()
    {
        assertEquals(5, calc.div(10,2));
    }

}
