package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:19
 * To change this template use File | Settings | File Templates.
 */
public class MultipleReturns {
    public static void f(int i){
        try{
            System.out.println("1");
            if(i==1){
                return;
            }
            System.out.println("2");
            if(i==2){
                return;
            }
            System.out.println("3");
            if(i==3){
                return;
            }
            System.out.println("0");
            return;
        }finally{
            System.out.println("finally");
        }
    }
    public static void main(String[] args){
        for(int i=0;i<4;i++){
            f(i);
        }
    }
}
