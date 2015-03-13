package za.ac.cput.chapter5assignment.builderpattern;

/**
 * Created by student on 2015/03/12.
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return 3.14 * radius * radius;
    }

    public double calCircumference(){
        return 2 * 3.14 * radius;
    }

    public double calDiameter(){
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Radius "+radius+"\nArea: "+calcArea()+"\nCircumference: "+calCircumference()
                +"\nDiameter: "+calDiameter();
    }
}
