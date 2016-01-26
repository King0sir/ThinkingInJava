package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-14
 * Time: 下午8:39
 * To change this template use File | Settings | File Templates.
 */
class MyException2 extends Exception{
    private int x;
    public MyException2(){}
    public MyException2(String msg){super(msg);}
    public MyException2(String msg,int x){super(msg);this.x=x;}
    public int val(){return x;}
    public String getMessage(){
        return "Message:"+x+" "+super.getMessage();
    }
}
public class ExtraFeatures {
    public static void f() throws MyException2{
        throw new MyException2();
    }
    public static void g() throws MyException2{
        throw new MyException2("from g()");
    }
    public static void h() throws MyException2{
        throw new MyException2("from h()",127);
    }
    public static void main(String[] args){
        try{
            f();
        }       catch(MyException2 e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }       catch(MyException2 e){
            e.printStackTrace(System.out);
        }
        try{
            h();
        }       catch(MyException2 e){
            e.printStackTrace(System.out);
            System.out.print("e.val="+e.val());
        }
    }


}
