package ThinkingInJava.chapter9.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
public abstract class StringProcessor implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s = "Hello world";
    public static void main(String[] args   ){
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }
}
