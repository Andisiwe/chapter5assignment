package za.ac.cput.chapter5assignment.decoratorpattern;

/**
 * Created by student on 2015/03/13.
 */
public class LegDecorator extends TrouserDecorator {

    public LegDecorator(Trouser trouser) {
        super(trouser);
    }

    public String design(){
        trouser.design();
        System.out.println("skinny design");
        tight();
        return "skinny design";
    }

    public void tight(){
        System.out.println("Am tight");
    }
}
