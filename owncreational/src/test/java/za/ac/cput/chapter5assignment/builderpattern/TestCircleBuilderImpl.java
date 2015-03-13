package za.ac.cput.chapter5assignment.builderpattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestCircleBuilderImpl {
    CircleBuilder circleBuilder;
    CircleBuilder circleBuilder2;

    @Before
    public void setUp() throws Exception {
        circleBuilder = new CircleBuilderImpl();
        circleBuilder2 = circleBuilder;

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCircle() throws Exception {
        circleBuilder.buildRadius();
        circleBuilder2.buildRadius();

        Assert.assertTrue(circleBuilder.getCircle() == circleBuilder2.getCircle());

    }
}
