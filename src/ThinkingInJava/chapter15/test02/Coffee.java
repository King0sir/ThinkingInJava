package ThinkingInJava.chapter15.test02;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 上午11:46
 * To change this template use File | Settings | File Templates.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName()+" " + id;
    }
}
