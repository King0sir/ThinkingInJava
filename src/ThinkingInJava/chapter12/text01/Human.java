package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:52
 * To change this template use File | Settings | File Templates.
 */
class Annoyance extends Exception{}
class Sneeze extends Annoyance{

}
public class Human {
    public static void main(String [] args){
        try{
           throw new Sneeze();
        }catch (Sneeze e){
            System.out.println("S");
        }catch (Annoyance a){
            System.out.println("a");
        }
        try{
            throw new Sneeze();
        }catch (Annoyance a){
            System.out.println("AS");

        }
    }
}
