package ThinkingInJava.chapter8.test01;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午8:30
 * To change this template use File | Settings | File Templates.
 */
class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}
class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor{
    String process(Object input){
        return((String)input).toLowerCase();
    }
}
class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Hello World";
    public static void main(String[] args  ){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
