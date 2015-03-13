package za.ac.cput.chapter5assignment;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.adapterpattern.SocketObjectAdapter;

/**
 * Created by student on 2015/03/12.
 */
public class TestObject {
    SocketObjectAdapter socketObjectAdapter;

    @Before
    public void setUp() throws Exception {
        socketObjectAdapter = new SocketObjectAdapter();

    }

    @Test
    public void testName() throws Exception {


    }
}
