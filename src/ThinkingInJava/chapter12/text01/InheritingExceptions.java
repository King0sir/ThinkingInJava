package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-14
 * Time: 下午8:12
 * To change this template use File | Settings | File Templates.
 */
class SimpleException extends Exception{

}
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String[] args){
        InheritingExceptions sed = new InheritingExceptions();
        try{
            sed.f();
        }catch (SimpleException e){
            e.printStackTrace();
        }
    }
}
