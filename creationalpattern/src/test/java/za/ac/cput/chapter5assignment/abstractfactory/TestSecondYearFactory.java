package za.ac.cput.chapter5assignment.abstractfactory;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.abstractfactory.SecondYearDS;
import za.ac.cput.chapter5assignment.abstractfactory.SecondYearSubjectFactory;
import za.ac.cput.chapter5assignment.abstractfactory.Subjectfactory;

/**
 * Created by student on 2015/03/12.
 */
public class TestSecondYearFactory {
    SecondYearSubjectFactory secondYearSubjectFactory;

    @Before
    public void setUp() throws Exception {
        secondYearSubjectFactory = SecondYearSubjectFactory.getSecondYearSubjectFactoryInstance();

    }

    @Test
    public void testgetSubjectName() throws Exception {
        Assert.assertFalse(new SecondYearDS().equals(secondYearSubjectFactory.getSubjectName("SecondYearDS")));

    }
}
