package za.ac.cput.chapter5assignment.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestCar {
    Car car;

    @Before
    public void setUp() throws Exception {
        car = Car.getInstance();

    }

    @Test
    public void testAccelerate() throws Exception {
        Assert.assertEquals(6, car.accelerate(5));

    }
}
