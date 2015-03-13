package za.ac.cput.chapter5assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestGradeCHandler {
    GradeCHandler c;

    @Before
    public void setUp() throws Exception {
        c = new GradeCHandler();

    }

    @Test
    public void testHandleRequest() throws Exception {
        Assert.assertEquals("C", c.handleRequest(66));

    }
}
