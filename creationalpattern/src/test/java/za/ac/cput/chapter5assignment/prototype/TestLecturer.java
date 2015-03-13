package za.ac.cput.chapter5assignment.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.Prototype.CloneObject;
import za.ac.cput.chapter5assignment.Prototype.Lecturer;

/**
 * Created by student on 2015/03/12.
 */
public class TestLecturer {
    CloneObject cloneObject;
    CloneObject c;

    @Before
    public void setUp() throws Exception {
        cloneObject = new Lecturer("Kabaso");

    }

    @Test
    public void testMakeCopy() throws Exception {
        c = cloneObject.makeCopy();
        Assert.assertNotEquals(cloneObject.makeCopy(), c);

    }
}
