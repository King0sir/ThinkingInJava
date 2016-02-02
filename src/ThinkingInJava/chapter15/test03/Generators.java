package ThinkingInJava.chapter15.test03;

import ThinkingInJava.chapter15.test02.Coffee;
import ThinkingInJava.chapter15.test02.CoffeeGenerator;
import ThinkingInJava.chapter15.test02.Fibonacci;
import ThinkingInJava.chapter15.test02.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午11:35
 * To change this template use File | Settings | File Templates.
 */
public class Generators {
    public static <T>Collection<T> fill(Collection<T> coll,Generator<T> gen , int n){
        for(int i = 0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee c : coffee){
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(),12);
        for(int i:fnumbers){
            System.out.print(i+" ");
        }
    }
}
