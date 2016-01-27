package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:27
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionSilencer {
    public static void main(String[] args){
        try{
            throw new RuntimeException();
        }finally {
            return;
        }
    }

}
