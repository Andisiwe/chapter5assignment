package za.ac.cput.chapter5assignment.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.Prototype.CloneObject;
import za.ac.cput.chapter5assignment.Prototype.Subject;

/**
 * Created by student on 2015/03/12.
 */
public class TestSubject {
    CloneObject cloneObject;
    CloneObject c;

    @Before
    public void setUp() throws Exception {
        cloneObject = new Subject("Technical Programming");

    }

    @Test
    public void testMakeCopy() throws Exception {
        c = cloneObject.makeCopy();
        Assert.assertNotEquals(c, cloneObject.makeCopy());

    }
}
