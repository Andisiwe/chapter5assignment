package za.ac.cput.chapter5assignment.adapterpattern;

/**
 * Created by student on 2015/03/12.
 */
public interface SocketAdapter {
    public Voltage get240Volt();
    public Voltage get12Volt();
    public Voltage get3Volt();
}
