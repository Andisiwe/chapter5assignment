package za.ac.cput.chapter5assignment.builderpattern;

/**
 * Created by student on 2015/03/12.
 */
public class CircleDirector {
    private CircleBuilder circleBuilder = null;

    public CircleDirector(CircleBuilder circleBuilder){
        this.circleBuilder = circleBuilder;
    }

    public void constructCircle(){
        circleBuilder.buildRadius();
    }

    public Circle getCircle(){
        return circleBuilder.getCircle();
    }
}
