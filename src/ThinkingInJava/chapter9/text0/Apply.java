package ThinkingInJava.chapter9.text0;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午9:07
 * To change this template use File | Settings | File Templates.
 */
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("USing PRocessor "+p.name());
        System.out.println(p.process(s));
    }
}class Upcase implements Processor{
    @Override
    public String name() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase implements Processor{
    @Override
    public String name() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String process(Object input){
        return((String)input).toLowerCase();
    }
}
class Splitter implements Processor{
    @Override
    public String name() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

