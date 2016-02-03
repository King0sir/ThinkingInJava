package ThinkingInJava.chapter15.test01;

import ThinkingInJava.chapter15.test02.Amphibian;
import ThinkingInJava.chapter15.test02.Vehicle;

import java.io.FileFilter;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-29
 * Time: 上午12:00
 * To change this template use File | Settings | File Templates.
 */
public class TupleTest {
    public static TwoTuple<String , Integer> f(){
        return new TwoTuple<String, Integer>("hi",12);
    }
    public static ThreeTuple<Amphibian,String ,Integer> g(){
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(),"s",1);
    }
    public static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(),new Amphibian(),"ss",12);
    }
    public static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(),new Amphibian(),"s",3,2.1);
    }

    public static void main(String[] args) {
        TwoTuple<String ,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());

    }
}
