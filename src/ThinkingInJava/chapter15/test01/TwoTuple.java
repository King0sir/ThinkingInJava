package ThinkingInJava.chapter15.test01;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-28
 * Time: 下午11:28
 * To change this template use File | Settings | File Templates.
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B last;
    public TwoTuple(A a,B b){
        first =a ;last = b;
    }
    public String toString (){
        return "("+first+","+last+")";
    }
}
