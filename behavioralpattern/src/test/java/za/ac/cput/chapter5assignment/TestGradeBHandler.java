package za.ac.cput.chapter5assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestGradeBHandler {
    GradeBHandler b;

    @Before
    public void setUp() throws Exception {
        b = new GradeBHandler();

    }

    @Test
    public void testHandleRequest() throws Exception {
        Assert.assertEquals("B", b.handleRequest(72));

    }
}
