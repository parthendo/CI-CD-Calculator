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
        int a = 5;
        int b = 6;
        int out = 11;
        int ans = calculator.add(a,b);
        Assert.assertEquals(out,ans);
    }
}