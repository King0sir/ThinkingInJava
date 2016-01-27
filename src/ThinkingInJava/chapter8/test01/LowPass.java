package ThinkingInJava.chapter8.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午8:50
 * To change this template use File | Settings | File Templates.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){this.cutoff=cutoff;}
    public Waveform process(Waveform input){
        return input;
    }
}
