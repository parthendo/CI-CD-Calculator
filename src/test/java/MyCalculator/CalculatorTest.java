package MyCalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = null;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        assertEquals("Adding two numbers",4,calculator.add(2,2),1e-5);
        assertNotEquals("Adding two numbers",6,calculator.add(2,2));
    }
}