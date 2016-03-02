package ThinkingInJava.study.text0;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-6
 * Time: 下午5:54
 * To change this template use File | Settings | File Templates.
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("2.15");
        int a =value.intValue();
        System.out.println(a);
        float b = value.floatValue();
        System.out.println(b);
        System.out.println(value.add(new BigDecimal("2")));
        System.out.println(value.multiply(new BigDecimal("2")));
        System.out.println(value.subtract(new BigDecimal("2")));
        System.out.println(value.divide(new BigDecimal("2")));
        System.out.println(value.compareTo(new BigDecimal(2)));
        System.out.println(value.compareTo(new BigDecimal(3)));
        System.out.println(value.compareTo(new BigDecimal(2.15)));
        System.out.println(value.compareTo(new BigDecimal("2.15")));
        System.out.println(new BigDecimal("215").compareTo(new BigDecimal(215l)));





    }
}
