package ThinkingInJava.chapter15.test03;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-1
 * Time: 下午1:45
 * To change this template use File | Settings | File Templates.
 */
public class Sets {
    public static<T> Set<T> union(Set <T> a,Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    public static <T> Set<T> intersection(Set<T> superset,Set<T> subset){
        Set<T> result = new HashSet<T>(superset);
        result.retainAll(subset);
        return result;
    }
    public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }
    public static<T> Set<T> complement(Set <T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}