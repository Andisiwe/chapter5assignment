package za.ac.cput.chapter5assignment.facadepattern;

/**
 * Created by student on 2015/03/12.
 */
public class Car implements Vehicle {
    @Override
    public String getWhereItMoves() {
        return "Car moves on land";
    }
}
