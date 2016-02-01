package ThinkingInJava.chapter15.test03;

import ThinkingInJava.chapter15.test01.FiveTuple;
import ThinkingInJava.chapter15.test01.FourTuple;
import ThinkingInJava.chapter15.test01.ThreeTuple;
import ThinkingInJava.chapter15.test01.TwoTuple;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-1
 * Time: 下午1:29
 * To change this template use File | Settings | File Templates.
 */
public class Tuple {
    public static <A,B>TwoTuple<A,B> tuple(A a,B b){
        return new TwoTuple<A, B>(a,b);
    }
    public static <A,B,C>ThreeTuple<A,B,C> tuple(A a,B b,C c){
        return new ThreeTuple<A, B, C>(a,b,c);
    }
    public static <A,B,C,D>FourTuple<A,B,C,D> tuple(A a,B b,C c,D d){
        return new FourTuple<A, B, C, D>(a,b,c,d);
    }
    public static <A,B,C,D,E>FiveTuple<A,B,C,D,E> tuple(A a,B b,C c,D d,E e){
        return new FiveTuple<A, B, C, D, E>(a,b,c,d,e);
    }
}
