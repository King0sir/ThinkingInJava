package ThinkingInJava.chapter14.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-26
 * Time: 下午1:49
 * To change this template use File | Settings | File Templates.
 */
interface Interface{
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface{
    public void doSomething(){System.out.println("doSomething");}
    public void somethingElse(String arg){
        System.out.println("somethingElse"+arg);
    }
}
class SimpleProxy implements Interface{
    private Interface proxied;

    SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy doSomethingElse"+arg);
        proxied.somethingElse(arg);
    }
}
public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }

}
