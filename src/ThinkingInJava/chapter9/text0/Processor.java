package ThinkingInJava.chapter9.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-2
 * Time: 下午9:06
 * To change this template use File | Settings | File Templates.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
