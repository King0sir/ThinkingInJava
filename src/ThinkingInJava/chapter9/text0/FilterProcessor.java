package ThinkingInJava.chapter9.text0;
import ThinkingInJava.chapter8.test01.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午9:14
 * To change this template use File | Settings | File Templates.
 */
class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter=filter;
    }
    public  String name(){return filter.name();}
    public Waveform process(Object input){
        return filter.process((Waveform)input);
    }

}
public class FilterProcessor {
    public static void main(String[] args   ){
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }
}
