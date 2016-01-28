package ThinkingInJava.chapter15.test01;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-28
 * Time: 下午11:20
 * To change this template use File | Settings | File Templates.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){this.a = a;}
    public void set(T a){this.a = a;}
    public T get(){return a;}

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get();

    }
}
