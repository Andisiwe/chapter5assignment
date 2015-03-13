package za.ac.cput.chapter5assignment.abstractfactory;

/**
 * Created by student on 2015/03/11.
 */
public class ThirdYearSubjectFactory implements Subjectfactory {
    private static ThirdYearSubjectFactory thirdYearSubjectFactory = null;

    private ThirdYearSubjectFactory() {
    }

    public static ThirdYearSubjectFactory getThirdYearSubjectFactoryInstance() {
        if (thirdYearSubjectFactory == null)
            return new ThirdYearSubjectFactory();
        return thirdYearSubjectFactory;
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
