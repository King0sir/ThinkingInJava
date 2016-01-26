package ThinkingInJava.chapter9.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 下午8:54
 * To change this template use File | Settings | File Templates.
 */
class A{
    interface B{
        void f();
    }
    public class Bimp implements B{
        public void f(){}
    }
    public class Bimp2 implements B{
        public void f(){}
    }
    public interface C{
        public void f();
    }
    private class CImp2 implements C{
        public void f(){}
    }
    private interface D{
        void f();
    }
    private class DImp implements D{
        public void f(){}
    }
    public class DImp2 implements D{
        public void f(){}
    }
    public D getD(){return new DImp2();}
    private D dRef;
    public void receiveD(D d){
        dRef=d;
        dRef.f();
    }

}
interface E{
    interface G{
        void f();
    }
    public interface H{
        void f();
    }
    void g();
}
public class NestingInterfaces {
    public class Bimp implements A.B{
        public void f(){}
    }
    class CImp implements A.C{
        public void f(){}
    }
//    class DImp implements A.D{
//        public void f(){}
//    }
}
