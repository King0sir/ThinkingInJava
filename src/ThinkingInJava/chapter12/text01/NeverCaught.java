package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-15
 * Time: 下午6:50
 * To change this template use File | Settings | File Templates.
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("from f()");
    }
    static void g(){
        f();
    }
    public static void main(String[] args){
        g();
    }
}
