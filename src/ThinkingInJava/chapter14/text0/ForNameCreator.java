package ThinkingInJava.chapter14.text0;

import ThinkingInJava.example.pets.Pet;
import ThinkingInJava.example.pets.PetCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-22
 * Time: 下午1:43
 * To change this template use File | Settings | File Templates.
 */
public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "ThinkingInJava.example.pets.Mutt",
            "ThinkingInJava.example.pets.Pug",
            "ThinkingInJava.example.pets.EgyptianMau",
            "ThinkingInJava.example.pets.Manx",
            "ThinkingInJava.example.pets.Cymric",
            "ThinkingInJava.example.pets.Rat",
            "ThinkingInJava.example.pets.Mouse",
            "ThinkingInJava.example.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typeNames){
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static {loader();}
    public List<Class<? extends Pet>> types(){return types;}
}
