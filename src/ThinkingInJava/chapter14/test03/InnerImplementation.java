package ThinkingInJava.chapter14.test03;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-28
 * Time: 下午6:50
 * To change this template use File | Settings | File Templates.
 */
class InnerA{
    private static class C implements A{
        public void f(){System.out.println(" public C.f()");}
        public void g(){System.out.println(" public C.g()");}
        void u(){System.out.println(" package C.u()");}
        protected void v(){System.out.println(" protected C.v()");}
        private void w(){System.out.println(" private C.w()");}
    }
    public static A makeA(){return new C();}
}
public class InnerImplementation {
    public static void main(String[] args)throws Exception{
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImplementation.callHiddenMethod(a,"g");
        HiddenImplementation.callHiddenMethod(a,"u");
        HiddenImplementation.callHiddenMethod(a,"v");
        HiddenImplementation.callHiddenMethod(a,"w");
    }
}
