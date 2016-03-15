package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-9
 * Time: 上午11:40
 * To change this template use File | Settings | File Templates.
 */
public class IntegerValue {
    public static Integer max = Integer.MAX_VALUE;
    public static Integer min = Integer.MIN_VALUE;


    public static void main(String[] args) {
        System.out.println(max);
        System.out.println(min);

        Integer a = new Integer(321654987);
        Integer b = new Integer(123456789);
        Integer c = a+1;
        System.out.println(c);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a>b);

        System.out.println(valueFormat(2, 6));
        System.out.println(Integer.valueOf(valueFormat(2, 6)));

    }

    private static String valueFormat(int value, int length) {
        StringBuilder strB = new StringBuilder("%0");
        strB.append(length);
        strB.append("d");
        String str = String.format(strB.toString(), value);
        return str;
    }
}
