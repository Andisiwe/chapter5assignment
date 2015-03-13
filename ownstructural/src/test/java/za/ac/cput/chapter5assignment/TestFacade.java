package za.ac.cput.chapter5assignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.facadepattern.VehicleMaker;

/**
 * Created by student on 2015/03/12.
 */
public class TestFacade {
    VehicleMaker vehicleMaker;

    @Before
    public void setUp() throws Exception {
        vehicleMaker = new VehicleMaker();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCar() throws Exception {
        Assert.assertTrue(vehicleMaker.carInfo().equals("Car moves on land"));

    }

    @Test
    public void testBoat() throws Exception {
        Assert.assertTrue(vehicleMaker.boatInfo().equals("Boat moves on water"));

    }

    @Test
    public void testAeroplane() throws Exception {
        Assert.assertTrue(vehicleMaker.aeroplaneInfo().equals("Aeroplane moves in the sky"));

    }
}
