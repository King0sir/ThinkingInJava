package ThinkingInJava.chapter15.test03;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午1:19
 * To change this template use File | Settings | File Templates.
 */
public class GenericMethods  {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
