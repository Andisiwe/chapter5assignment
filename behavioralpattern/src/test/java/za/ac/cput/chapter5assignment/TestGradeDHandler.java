package za.ac.cput.chapter5assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestGradeDHandler {
    GradeDHandler d;

    @Before
    public void setUp() throws Exception {
        d = new GradeDHandler();

    }

    @Test
    public void testHandleRequest() throws Exception {
        Assert.assertEquals("D", d.handleRequest(61));

    }
}
