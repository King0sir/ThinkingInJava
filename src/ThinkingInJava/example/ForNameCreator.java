//: ThinkingInJava.chapter14.test01/pets/ForNameCreator.java
package ThinkingInJava.example;
import ThinkingInJava.chapter14.test01.Pet;
import ThinkingInJava.chapter14.test01.PetCreator;

import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "ThinkingInJava.chapter14.test01.Mutt",
    "ThinkingInJava.chapter14.test01.Pug",
    "ThinkingInJava.chapter14.test01.EgyptianMau",
    "ThinkingInJava.chapter14.test01.Manx",
    "ThinkingInJava.chapter14.test01.Cymric",
    "ThinkingInJava.chapter14.test01.Rat",
    "ThinkingInJava.chapter14.test01.Mouse",
    "ThinkingInJava.chapter14.test01.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
