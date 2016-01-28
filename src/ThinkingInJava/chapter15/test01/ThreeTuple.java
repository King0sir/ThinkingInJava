package ThinkingInJava.chapter15.test01;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-28
 * Time: 下午11:33
 * To change this template use File | Settings | File Templates.
 */
public class ThreeTuple<A,B,C>extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A a,B b,C c){
        super(a,b);
        third =c;
    }
    public String toString(){
        return "("+first+","+last+"," +","+third+")";

    }
}
