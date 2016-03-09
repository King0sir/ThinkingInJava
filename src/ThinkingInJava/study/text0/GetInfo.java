package ThinkingInJava.study.text0;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-7
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public class GetInfo {
    public static void main(String[] args) {
        try{
            Node node = new Node(1,"a",new Node(2,"b"));
            Class clazz = node.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for(Field f : fields) {
                PropertyDescriptor pd = new PropertyDescriptor(f.getName(),clazz);
                Method getMethod = pd.getReadMethod();//获得get方法
                Object o = getMethod.invoke(clazz);
                System.out.println(o);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
