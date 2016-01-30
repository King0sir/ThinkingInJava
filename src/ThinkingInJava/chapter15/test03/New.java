package ThinkingInJava.chapter15.test03;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午2:36
 * To change this template use File | Settings | File Templates.
 */
public class New {
    public static <K,V>Map<K,V> map(){
        return new HashMap<K, V>();
    }
    public static <T>List<T> list(){
        return new ArrayList<T>();
    }
    public static <T>LinkedList<T> linkedList(){
        return new LinkedList<T>();
    }
    public static <T> Set<T> set(){
        return new HashSet<T>();
    }
    public static <T> Queue<T> queue(){
        return new PriorityQueue<T>();
    }

    public static void main(String[] args) {
        Map<String ,List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.linkedList();
        Set<String > ss = New.set();
        Queue<String > qs = New.queue();
        Queue<String > qss = New.linkedList();

    }

}
