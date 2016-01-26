package ThinkingInJava.chapter12.text01;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-14
 * Time: 下午8:36
 * To change this template use File | Settings | File Templates.
 */
public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args){
        try{
            throw new NullPointerException();

        }   catch(NullPointerException e){
            logException(e);
        }
    }
}
