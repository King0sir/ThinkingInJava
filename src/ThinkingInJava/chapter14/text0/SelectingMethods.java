package ThinkingInJava.chapter14.text0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-26
 * Time: 下午6:34
 * To change this template use File | Settings | File Templates.
 */
class MethodSelector implements InvocationHandler{
    private Object proxied;
    public MethodSelector(Object proxied){
        this.proxied = proxied;
    }
    public  Object invoke (Object proxy, Method method , Object[] args)throws  Throwable{
        if(method.getName().equals("interesting")){
            System.out.println(" proxy detected the interesting method");;
        }
        return method.invoke(proxied , args);
    }
}

interface SomeMethods{

}

public class SelectingMethods {
}
