package ThinkingInJava.study.text0;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-18
 * Time: 下午1:46
 * To change this template use File | Settings | File Templates.
 */
public class Construstor {
    static Set intSet = new HashSet();
    static Set tSet = new TreeSet();


    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0 ;i<20;i++){
            intSet.add(random.nextInt(40));
        }

        System.out.println("HashSet -----"+intSet);

        for(int i = 0 ;i<20;i++){
            tSet.add(random.nextInt(40));
        }
        System.out.println("TreeSet -----"+tSet);
    }
}
