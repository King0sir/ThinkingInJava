package ThinkingInJava.chapter15.test01;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-29
 * Time: 上午12:15
 * To change this template use File | Settings | File Templates.
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random random = new Random();
    public void add(T item ){storage.add(item);}
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s:("I want to say something else and get out").split(" ")){
            rs.add(s);
        }
        for(int i = 0;i<9;i++){
            System.out.println(rs.select()+" ");
        }
    }
}
