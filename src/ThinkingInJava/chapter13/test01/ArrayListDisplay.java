package ThinkingInJava.chapter13.test01;

import ThinkingInJava.example.Coffee;
import ThinkingInJava.example.CoffeeGenerator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-30
 * Time: 下午2:56
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for(Coffee c : new CoffeeGenerator(10)){
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
