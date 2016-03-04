package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-4
 * Time: 上午11:05
 * To change this template use File | Settings | File Templates.
 */
public class LongValueDisplay {
    public static void main(String[] args) {
        Long amt=10000000004564548l;
        System.out.println(amt/10.0);
        java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        System.out.println(nf.format(amt/10.0));
    }
}
