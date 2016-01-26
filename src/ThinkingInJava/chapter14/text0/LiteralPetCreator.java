package ThinkingInJava.chapter14.text0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-24
 * Time: 上午11:41
 * To change this template use File | Settings | File Templates.
 */
public class LiteralPetCreator extends PetCreator{
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class
            ));
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    public List<Class<? extends Pet>> types(){
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
