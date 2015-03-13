package za.ac.cput.chapter5assignment.builderpattern;

/**
 * Created by student on 2015/03/12.
 */
public class CircleBuilderImpl implements CircleBuilder {
    private Circle circle;

    public CircleBuilderImpl(){
        circle = new Circle();
    }

    @Override
    public void buildRadius() {
        circle.setRadius(2.5);
    }

    @Override
    public Circle getCircle() {
        return circle;
    }
}
