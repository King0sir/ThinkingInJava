package ThinkingInJava.chapter14.test03;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-27
 * Time: 下午11:40
 * To change this template use File | Settings | File Templates.
 */
class B implements A{
    public void f(){}
    public void g(){}
}
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        System.out.println(a.getClass().getName());
        if(a instanceof B){
            B b = (B) a;
            b.g();
        }
    }
}
