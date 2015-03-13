package za.ac.cput.chapter5assignment.factorymethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5assignment.factorymethod.EmployeeFactory;
import za.ac.cput.chapter5assignment.factorymethod.Lecturer;

/**
 * Created by student on 2015/03/12.
 */
public class TestEmployeeFactory {
    EmployeeFactory employeeFactory;

    @Before
    public void setUp() throws Exception {
        employeeFactory = EmployeeFactory.getEmployeeFactoryInstance();

    }

    @Test
    public void testGetEmployeeRole() throws Exception {
        Assert.assertFalse(new Lecturer().equals(employeeFactory.getEmployeeRole("Lecturer")));

    }
}
