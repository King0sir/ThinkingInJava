package ThinkingInJava.chapter14.text0;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-24
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet radomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList (int size){
        return creator.arrayList(size);
    }
}
