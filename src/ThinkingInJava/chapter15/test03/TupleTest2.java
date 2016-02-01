package ThinkingInJava.chapter15.test03;

import ThinkingInJava.chapter15.test01.ThreeTuple;
import ThinkingInJava.chapter15.test01.TwoTuple;
import static ThinkingInJava.chapter15.test03.Tuple.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-1
 * Time: 下午1:34
 * To change this template use File | Settings | File Templates.
 */
public class TupleTest2 {
    static TwoTuple<String , Integer> f(){
        return tuple("hi",23);
    }
    static TwoTuple f2(){return tuple("hi",23);}
}
