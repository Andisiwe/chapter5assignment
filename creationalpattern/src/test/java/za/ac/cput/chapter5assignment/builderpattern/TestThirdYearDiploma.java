package za.ac.cput.chapter5assignment.builderpattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.builderpattern.DiplomaCourse;
import za.ac.cput.chapter5assignment.builderpattern.ThirdYearDiplomaCourseBuilder;

/**
 * Created by student on 2015/03/12.
 */
public class TestThirdYearDiploma {
    ThirdYearDiplomaCourseBuilder thirdYearDiplomaCourseBuilder;

    @Before
    public void setUp() throws Exception {
        thirdYearDiplomaCourseBuilder = new ThirdYearDiplomaCourseBuilder();

    }

    @Test
    public void testGetDiplomaCourse() throws Exception {
        Assert.assertFalse(new DiplomaCourse().equals(thirdYearDiplomaCourseBuilder.getDiplomaCourse()));

    }
}
