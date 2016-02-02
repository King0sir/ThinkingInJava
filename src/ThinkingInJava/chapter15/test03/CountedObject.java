package ThinkingInJava.chapter15.test03;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-31
 * Time: 上午12:12
 * To change this template use File | Settings | File Templates.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id(){return id;}
    public String toString(){return "CountObject "+id;}
}
