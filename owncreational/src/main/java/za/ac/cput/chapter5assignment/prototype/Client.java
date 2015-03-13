package za.ac.cput.chapter5assignment.prototype;

/**
 * Created by student on 2015/03/12.
 */
public class Client implements CloneObject {
    private String name;

    public Client(String name){
        this.name = name;
    }

    @Override
    public CloneObject makeCopy() {
        return new Client(name);
    }

    @Override
    public String toString() {
        return "Client name: "+name;
    }
}
