package ThinkingInJava.chapter15.test01;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-28
 * Time: 下午11:54
 * To change this template use File | Settings | File Templates.
 */
public class FiveTuple<A,B,C,D,E>extends FourTuple<A,B,C,D> {
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d,E e) {
        super(a, b, c, d);
        fifth = e;
    }
    public String toString (){
        return "("+first+","+last+"," +","+third+","+fourth+","+fifth+")";
    }
}
