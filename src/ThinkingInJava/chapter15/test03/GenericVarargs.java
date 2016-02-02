package ThinkingInJava.chapter15.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午11:30
 * To change this template use File | Settings | File Templates.
 */
public class GenericVarargs {
    public static <T>List<T> makeList(T...args){
        List<T> result = new ArrayList<T>();
        for(T item: args){
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A","B","C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
