package ThinkingInJava.chapter13.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-30
 * Time: 上午11:19
 * To change this template use File | Settings | File Templates.
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields){
        String result = " ";
        for(int i= 0;i<fields.length;i++){
            result += fields[i];
        }
        return result;
    }
    public String explicit(String ...fields){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<fields.length;i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
}
