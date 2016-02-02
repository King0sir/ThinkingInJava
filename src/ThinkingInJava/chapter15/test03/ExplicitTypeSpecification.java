package ThinkingInJava.chapter15.test03;

import ThinkingInJava.chapter14.test02.Person;
import ThinkingInJava.example.pets.Pet;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午10:43
 * To change this template use File | Settings | File Templates.
 */
public class ExplicitTypeSpecification  {
    static void f(Map<Person, List<Pet>> petPeople){}

    public static void main(String[] args) {
        f(New.<Person,List<Pet>>map());
    }
}
