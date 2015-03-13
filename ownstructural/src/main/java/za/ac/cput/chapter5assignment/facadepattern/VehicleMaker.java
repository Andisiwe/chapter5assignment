package za.ac.cput.chapter5assignment.facadepattern;

/**
 * Created by student on 2015/03/12.
 */
public class VehicleMaker {
    private Vehicle car;
    private Vehicle boat;
    private Vehicle aeroplane;

    public VehicleMaker(){
        car = new Car();
        boat = new Boat();
        aeroplane = new Aeroplane();
    }

    public String carInfo(){
        return car.getWhereItMoves();
    }

    public String boatInfo(){
        return boat.getWhereItMoves();
    }

    public String aeroplaneInfo(){
        return aeroplane.getWhereItMoves();
    }
}
