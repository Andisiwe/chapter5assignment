package za.ac.cput.chapter5assignment.abstractfactory;

/**
 * Created by student on 2015/03/12.
 */
public class JustFruit implements FruitFactory {
    private static JustFruit fruit = null;

    private JustFruit(){

    }

    public static JustFruit getInstance(){
        if(fruit == null){
            fruit = new JustFruit();
        }
        return fruit;
    }

    public Fruit getName(String n){
        if(n.equalsIgnoreCase("Apple")){
            return new Apple();
        }else{
            return new Cherry();
        }
    }

    @Override
    public String fruitColor(String c) {
        return "Green";
    }
}
