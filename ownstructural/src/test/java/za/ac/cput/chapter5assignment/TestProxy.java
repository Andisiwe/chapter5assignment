package za.ac.cput.chapter5assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.Proxy.Bread;
import za.ac.cput.chapter5assignment.Proxy.Proxy;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public class TestProxy {
    Proxy p;
    Bread b;

    @Before
    public void setUp() throws Exception {
        p = new Proxy();
        b = new Bread();

    }

    @Test
    public void testItemAdded() throws Exception {
        Assert.assertEquals("New Item has been made available for sale at "+ new Date() ,b.itemAdded());

    }

    @Test
    public void testProxy() throws Exception {
        Assert.assertNull(p.itemAdded());

    }
}
