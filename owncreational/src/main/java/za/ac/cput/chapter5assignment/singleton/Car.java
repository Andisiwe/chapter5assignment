package za.ac.cput.chapter5assignment.singleton;

/**
 * Created by student on 2015/03/12.
 */
public class Car {
    private static Car car = null;

    private Car(){
    }

    public static Car getInstance(){
        if(car == null) {
            car = new Car();
        }
        return car;
    }

    public int accelerate(int speed){
        return speed + 1;
    }
}
