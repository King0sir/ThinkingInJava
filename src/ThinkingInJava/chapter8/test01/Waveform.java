package ThinkingInJava.chapter8.test01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午8:47
 * To change this template use File | Settings | File Templates.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){return "Waveform "+id;}
}

