package ThinkingInJava.study.text0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 上午10:32
 * To change this template use File | Settings | File Templates.
 */
public class NullTest {
    public static void main(String[] args   ){
        String a=null;
        if(a==null||a.length()==1){
        }

        a="汉字";
        System.out.println(a.length());
        Pattern pattern=Pattern.compile("([\\u4e00-\\u9fa5]){0}");
        Matcher matcher=pattern.matcher(a);
        System.out.println(matcher.find());
    }
}
