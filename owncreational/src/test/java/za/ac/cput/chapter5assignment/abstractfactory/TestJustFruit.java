package za.ac.cput.chapter5assignment.abstractfactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestJustFruit {
    JustFruit fruit;

    @Before
    public void setUp() throws Exception {
        fruit = JustFruit.getInstance();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAnimalFactory() throws Exception {

        Assert.assertFalse(fruit.getName("Apple").equals(new Apple()));

    }
}
