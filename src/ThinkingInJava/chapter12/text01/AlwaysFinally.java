package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:14
 * To change this template use File | Settings | File Templates.
 */
class FourException extends Exception{}
public class AlwaysFinally {
    public static void main(String[] args){
        try{
            System.out.println("try");
            try{
                throw new FourException();
            }finally {
                System.out.println("inner finally");
            }
        }catch (FourException e){
            System.out.println("catch");
        }finally {
            System.out.println("outer finally");
        }
    }
}
