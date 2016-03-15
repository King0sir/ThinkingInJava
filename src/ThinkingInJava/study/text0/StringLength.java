package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-2
 * Time: 下午5:44
 * To change this template use File | Settings | File Templates.
 */
public class StringLength {
    public static void main(String[] args) {
        String three2one = "9111010509557257XC";
        String normal = "310114002776882";
        System.out.println(three2one+"长度"+three2one.length());
        System.out.println(normal+"长度"+normal.length());

        System.out.println(three2one.hashCode());
        System.out.println(normal.hashCode());
        System.out.println("9111010509557257XC".hashCode());

    }
}
