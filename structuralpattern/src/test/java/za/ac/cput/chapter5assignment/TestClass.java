package za.ac.cput.chapter5assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.adapterpattern.SocketClassAdapter;
import za.ac.cput.chapter5assignment.adapterpattern.Voltage;

/**
 * Created by student on 2015/03/12.
 */
public class TestClass {
    SocketClassAdapter socketClassAdapter;

    @Before
    public void setUp() throws Exception {
        socketClassAdapter = new SocketClassAdapter();

    }

    @Test
    public void testName() throws Exception {
    }
}
