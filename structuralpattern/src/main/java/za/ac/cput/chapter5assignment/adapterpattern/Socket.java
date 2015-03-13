package za.ac.cput.chapter5assignment.adapterpattern;

/**
 * Created by student on 2015/03/12.
 */
public class Socket {
    public Voltage getVoltage() {
        return new Voltage(240);
    }
}
