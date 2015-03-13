package za.ac.cput.chapter5assignment.abstractfactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.abstractfactory.ThirdYearDS;
import za.ac.cput.chapter5assignment.abstractfactory.ThirdYearSubjectFactory;

/**
 * Created by student on 2015/03/12.
 */
public class TestThirdYearFactory {
    ThirdYearSubjectFactory thirdYearSubjectFactory;

    @Before
    public void setUp() throws Exception {
        thirdYearSubjectFactory = ThirdYearSubjectFactory.getThirdYearSubjectFactoryInstance();

    }

    @Test
    public void testGetSubjectName() throws Exception {
        Assert.assertFalse(new ThirdYearDS().equals(thirdYearSubjectFactory.getSubjectName("ThirdYearDS")));

    }
}
