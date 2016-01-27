package ThinkingInJava.chapter9.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 下午9:02
 * To change this template use File | Settings | File Templates.
 */
interface Service{
    void m1();
    void m2();
}
interface ServiceFactory{
    Service getService();
}
class Im1 implements Service{
    Im1(){}
    public void m1(){System.out.println("Im1,m1");}
    public void m2(){System.out.println("Im1.m2");}
}
class Im2 implements Service{
    Im2(){}
    public void m1(){System.out.println("Im2,m1");}
    public void m2(){System.out.println("Im2.m2");}
}
class Im2F implements ServiceFactory{
    public Service getService(){
        return new Im2();
    }
}
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.m1();s.m2();
    }
    public static void main(String[] args){
        serviceConsumer(new Im2F());
        serviceConsumer(new Im2F());
    }
}
