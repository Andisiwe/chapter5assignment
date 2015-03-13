package za.ac.cput.chapter5assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.decoratorpattern.LegDecorator;
import za.ac.cput.chapter5assignment.decoratorpattern.Trouser;

/**
 * Created by student on 2015/03/13.
 */
public class TestDecorator {
    Trouser trouser;

    @Before
    public void setUp() throws Exception {
        trouser = new LegDecorator(trouser);

    }

    @Test
    public void testDesign() throws Exception {
        Assert.assertFalse(trouser.design().equals("skinny design"));

    }
}
