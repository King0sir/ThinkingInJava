package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-14
 * Time: 下午8:23
 * To change this template use File | Settings | File Templates.
 */
class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){super(msg);}
}
public class FullConstructors {
    public static void f() throws MyException{
        throw new MyException();
    }
    public static void g() throws MyException{
        throw new MyException("from g()");
    }
    public static void main(String[] args){
        try{
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }catch (MyException e){
            e.printStackTrace(System.err);
        }

    }
}
