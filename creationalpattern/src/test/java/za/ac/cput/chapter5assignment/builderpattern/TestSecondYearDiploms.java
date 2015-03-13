package za.ac.cput.chapter5assignment.builderpattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.builderpattern.DiplomaCourse;
import za.ac.cput.chapter5assignment.builderpattern.SecondYearDiplomaCourseBuilder;

/**
 * Created by student on 2015/03/12.
 */
public class TestSecondYearDiploms {
    SecondYearDiplomaCourseBuilder secondYearDiplomaCourseBuilder;

    @Before
    public void setUp() throws Exception {
        secondYearDiplomaCourseBuilder = new SecondYearDiplomaCourseBuilder();

    }

    @Test
    public void testGetDiplomaCourse() throws Exception {
        Assert.assertFalse(new DiplomaCourse().equals(secondYearDiplomaCourseBuilder.getDiplomaCourse()));

    }
}
