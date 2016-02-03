package ThinkingInJava.chapter15.test04;

import ThinkingInJava.chapter15.test01.FourTuple;
import ThinkingInJava.chapter15.test01.TupleTest;
import ThinkingInJava.chapter15.test02.Amphibian;
import ThinkingInJava.chapter15.test02.Vehicle;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-2
 * Time: 下午1:58
 * To change this template use File | Settings | File Templates.
 */
public class TupleList<A,B,C,D>extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TupleList<Vehicle,Amphibian,String,Integer> tl = new TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        for(FourTuple<Vehicle,Amphibian,String,Integer> i: tl){
            System.out.println(i);
        }
    }
}
