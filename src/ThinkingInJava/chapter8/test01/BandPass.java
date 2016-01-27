package ThinkingInJava.chapter8.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午8:53
 * To change this template use File | Settings | File Templates.
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCut){
        lowCutoff=lowCut;
        highCutoff=highCut;
    }
    public Waveform process(Waveform input){return input;}
}
