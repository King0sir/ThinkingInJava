package ThinkingInJava.chapter8.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-1
 * Time: 下午7:11
 * To change this template use File | Settings | File Templates.
 */
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}
class Chess{
    Chess(){
        System.out.println("Chess()");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Chess c = new Chess();
    private Lettuce l = new Lettuce();
    private Sandwich(){System.out.println("Sandwich()");}
    public static void main(String ...args){
        new Sandwich();
    }

}
