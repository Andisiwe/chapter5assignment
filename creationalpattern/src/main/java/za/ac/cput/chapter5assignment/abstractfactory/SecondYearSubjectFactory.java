package za.ac.cput.chapter5assignment.abstractfactory;

/**
 * Created by student on 2015/03/11.
 */
public class SecondYearSubjectFactory implements Subjectfactory {
    private static SecondYearSubjectFactory secondYearSubjectFactory = null;

    private SecondYearSubjectFactory() {
    }

    public static SecondYearSubjectFactory getSecondYearSubjectFactoryInstance() {
        if (secondYearSubjectFactory == null)
            return new SecondYearSubjectFactory();
        return secondYearSubjectFactory;
    }

    @Override
    public Subject getSubjectName(String subjectCode) {
        if ("SecondYearDS".equalsIgnoreCase(subjectCode)) {
            return new SecondYearDS();
        } else {
            return new SecondYearTP();
        }
    }
}
