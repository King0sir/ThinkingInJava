package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
class VeryImportantException extends Exception{
    public String toString(){return "very Important";}
}
class HoHumException extends Exception{
    public String toString(){return "trivial";}
}
public class LostMessage {
    void f() throws VeryImportantException{
        throw
             new VeryImportantException();
    }
    void dispose() throws HoHumException{
        throw new HoHumException();
    }
    public static  void main(String[] args){
        try{
            LostMessage l = new LostMessage();
            try{
                l.f();
            }finally {
                l.dispose();
            }
        }  catch (Exception e){
            System.out.println(e);
        }
    }

}
