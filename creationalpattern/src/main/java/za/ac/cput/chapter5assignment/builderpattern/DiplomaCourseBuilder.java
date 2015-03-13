package za.ac.cput.chapter5assignment.builderpattern;

/**
 * Created by student on 2015/03/11.
 */
public interface DiplomaCourseBuilder {
    public void buildTechnicalPrograming();
    public void buildInformationSystems();
    public void buildInternetPrograming();
    public void buildDevelopmentSoftware();
    public DiplomaCourse getDiplomaCourse();
}
