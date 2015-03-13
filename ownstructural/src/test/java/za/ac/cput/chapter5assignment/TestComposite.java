package za.ac.cput.chapter5assignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.compositepattern.Student;

/**
 * Created by student on 2015/03/12.
 */
public class TestComposite {
    private Student student;
    private Student thirdYear;

    @Before
    public void setUp() throws Exception {
        student = new Student("Andisiwe", 210040475, 75);
        thirdYear = new Student("Yamkela", 123456789, 65);
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testStudent() throws Exception {
        student.addStudent(thirdYear);
        thirdYear.addStudent(thirdYear);
        Assert.assertEquals(student.getStudentList(), thirdYear.getStudentList());
    }
}
