package ThinkingInJava.chapter14.test03.packageaccess;

import ThinkingInJava.chapter14.test03.A;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-27
 * Time: 下午11:44
 * To change this template use File | Settings | File Templates.
 */
class C implements A {
    public void f(){System.out.println(" public C.f()");}
    public void g(){System.out.println(" public C.g()");}
    void u(){System.out.println(" package C.u()");}
    protected void v(){System.out.println(" protected C.v()");}
    private void w(){System.out.println(" private C.w()");}
}
public class HiddenC {
    public static A makeA(){return new C();}
}
