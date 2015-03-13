package za.ac.cput.chapter5assignment.Proxy;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public class Proxy {
    Bread bread;

    public Proxy(){
        System.out.println("Creating Proxy at " + new Date());
    }

    public String itemAdded(){
        if(bread == null){
            bread = new Bread();
        }
        bread.itemAdded();

        return null;
    }
}
