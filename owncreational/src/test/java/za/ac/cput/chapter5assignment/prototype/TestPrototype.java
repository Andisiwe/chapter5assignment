package za.ac.cput.chapter5assignment.prototype;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestPrototype {
    private CloneObject cloneObject;
    private CloneObject c;

    @Before
    public void setUp() throws Exception {
        cloneObject = new Client("Andisiwe");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testClient() throws Exception {
        c = cloneObject.makeCopy();
        Assert.assertNotEquals(cloneObject.makeCopy(), c);


    }
}
