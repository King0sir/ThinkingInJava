package ThinkingInJava.chapter14.text0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-26
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
class DynamicProxyHandler implements InvocationHandler{
    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied=proxied;
    }
    public Object invoke(Object proxy, Method method , Object[] args)throws Throwable{
        System.out.println("****proxy: "+ proxy.getClass()+", method : "+method+", args : "+args);
        if(args != null){
            for(Object arg: args){
                System.out.println("  "+arg);
            }
        }
        return method.invoke(proxied,args);
    }
}
public class SimpleDynamicProxy {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}
