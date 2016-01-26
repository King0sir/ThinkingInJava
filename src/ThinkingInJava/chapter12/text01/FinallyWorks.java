package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:08
 * To change this template use File | Settings | File Templates.
 */
class ThreeException extends Exception{}
public class FinallyWorks {
    static int count =0;
    public static void main(String[] args){
        while(true){
            try{
                if(count++==0){
                    throw new ThreeException();
                }
                System.out.print("no Exception");
            }catch (ThreeException e){
                System.out.println("three Exception");
            }finally {
                System.out.println("in finally");
                if(count==2)break;
            }
        }
    }
}
