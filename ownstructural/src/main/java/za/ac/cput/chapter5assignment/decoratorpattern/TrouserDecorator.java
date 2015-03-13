package za.ac.cput.chapter5assignment.decoratorpattern;

/**
 * Created by student on 2015/03/13.
 */
public class TrouserDecorator implements Trouser {
    Trouser trouser;

    public TrouserDecorator(Trouser trouser){
        this.trouser = trouser;
    }

    @Override
    public String design() {

        return null;
    }
}
