package za.ac.cput.chapter5assignment.Singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.Singleton.Calculator;

/**
 * Created by student on 2015/03/12.
 */
public class TestCalculator {
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = Calculator.getInstance();

    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(4,calc.add(2,2));

    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(4, calc.multiply(2,2));

    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(0, calc.substract(2,2));

    }
}
