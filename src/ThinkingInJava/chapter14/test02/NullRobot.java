package ThinkingInJava.chapter14.test02;

import java.lang.reflect.InvocationHandler;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-27
 * Time: 下午1:54
 * To change this template use File | Settings | File Templates.
 */
class NullRobotProxyHandler implements InvocationHandler{
    private String nullName;
//    private Robot proxied = new NRobot();
    NullRobotProxyHandler(Class<? extends Robot> type){

    }
}
public class NullRobot {
}
