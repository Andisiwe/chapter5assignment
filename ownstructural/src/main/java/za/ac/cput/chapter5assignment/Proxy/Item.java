package za.ac.cput.chapter5assignment.Proxy;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public abstract class Item {
    public String itemAdded(){
        return "New Item has been made available for sale at " + new Date();
    }
}
