package ThinkingInJava.chapter14.test03;

import ThinkingInJava.chapter14.test03.packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-27
 * Time: 下午11:47
 * To change this template use File | Settings | File Templates.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws  Exception{
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");
    }
    static void callHiddenMethod(Object a, String methodName)throws Exception{
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
