package za.ac.cput.chapter5assignment.abstractfactory;

/**
 * Created by student on 2015/03/12.
 */
public class CitrusFruit implements FruitFactory {
    private static CitrusFruit fruit = null;

    private CitrusFruit(){

    }

    public static CitrusFruit getInstance(){
        if(fruit == null){
            fruit = new CitrusFruit();
        }
        return fruit;
    }

    public Fruit getName(String n){
        if(n.equalsIgnoreCase("Orange")){
            return new Orange();
        }else{
            return new Lemon();
        }
    }
    @Override
    public String fruitColor(String c) {
        return "Orange";
    }
}
