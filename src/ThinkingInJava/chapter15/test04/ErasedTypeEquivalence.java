package ThinkingInJava.chapter15.test04;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-15
 * Time: 下午5:48
 * To change this template use File | Settings | File Templates.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1==c2);
    }
}
