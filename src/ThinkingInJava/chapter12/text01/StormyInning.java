package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:29
 * To change this template use File | Settings | File Templates.
 */
class BaseBallException extends Exception{}
class Foul extends Exception{}
class Strike extends Exception{}
abstract class Inning{
    public Inning()throws BaseBallException{}
    public void event() throws BaseBallException{

    }
    public  abstract void atBat() throws Strike,Foul;
    public void walk(){}
}
class StormException extends Exception{}
class RainedOut extends Exception{}
class PopFoul extends Foul{}
interface Storm{
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
public class StormyInning {
    public StormyInning() throws RainedOut,BaseBallException{}
    public StormyInning(String s)throws RainedOut,BaseBallException{}
}
