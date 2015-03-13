package za.ac.cput.chapter5assignment.factorymethod;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestAnimalFactory {
    AnimalFactory animal;

    @Before
    public void setUp() throws Exception {
        animal = AnimalFactory.getInstance();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAnimalFactory() throws Exception {

        Assert.assertFalse(animal.getAnimalSound("roar").equals(new Lion()));

    }
}
