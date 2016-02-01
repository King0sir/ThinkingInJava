package ThinkingInJava.chapter15.test03;

import java.util.EnumSet;
import java.util.Set;
import static ThinkingInJava.chapter15.test03.Watercolors.*;
import static ThinkingInJava.chapter15.test03.Sets.*;


/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-1
 * Time: 下午1:54
 * To change this template use File | Settings | File Templates.
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
        System.out.println("union(set1,set2) : "+union(set1,set2));
        Set<Watercolors> subset = intersection(set1,set2);
        System.out.println("intersection: "+subset);
        System.out.println("difference(set1,subset): " +difference(set1,subset));
        System.out.println("difference(set2,subset): "+difference(set2,subset));
        System.out.println("complement(set1,set2) : "+complement(set1,set2));

    }
}
