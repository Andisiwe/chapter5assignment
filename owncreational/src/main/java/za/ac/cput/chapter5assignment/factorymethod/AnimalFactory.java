package za.ac.cput.chapter5assignment.factorymethod;

/**
 * Created by student on 2015/03/12.
 */
public class AnimalFactory {
    private static AnimalFactory animalFactory = null;

    private AnimalFactory(){
    }

    public static AnimalFactory getInstance(){
        if(animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }

    public Animal getAnimalSound(String sound){
        if(sound.equalsIgnoreCase("roar")){
            return new Lion();
        }else{
            return new Dog();
        }
    }
}
