package ThinkingInJava.chapter12.text01;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-14
 * Time: 下午8:28
 * To change this template use File | Settings | File Templates.
 */
class LoggingException extends Exception{
    private static Logger logger = Logger.getLogger("Loggingception");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class LoggingExceptions {
    public static void main(String[] args){
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("caught"+e);
        }
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("caught"+e);
        }
    }
}
