package ThinkingInJava.study.text0;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-24
 * Time: 上午10:24
 * To change this template use File | Settings | File Templates.
 */
public class UnknowCode {
    public static void main(String[] args){
        Long a = System.currentTimeMillis();
        System.out.println(a);
        Date date = new Date(a);
        System.out.println(date);
        System.out.println(String.valueOf(date));
    }

}
