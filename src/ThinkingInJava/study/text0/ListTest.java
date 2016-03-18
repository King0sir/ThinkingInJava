package ThinkingInJava.study.text0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-16
 * Time: 下午12:09
 * To change this template use File | Settings | File Templates.
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(0));
        list.add(new Integer(1));
        System.out.println(list.get(0)+","+list.get(1));

    }
}
