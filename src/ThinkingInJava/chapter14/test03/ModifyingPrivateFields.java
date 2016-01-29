package ThinkingInJava.chapter14.test03;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-1-28
 * Time: 下午6:58
 * To change this template use File | Settings | File Templates.
 */
class WithPrivateFinalField{
    private int i = 1;
    private final String s = "I`m totally safe";
    private String s2 = "Am I Safe?";
    public String toString(){
        return "i= "+i+", "+s+", "+s2;
    }
}
public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception{
        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);
        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(pf): "+f.getInt(pf));
        f.setInt(pf,4712);
        System.out.println(pf);
        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println("f.get(pf): "+f.get(pf));
        f.set(pf,"No you are Not");
        System.out.println(pf);
        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(pf): "+f.get(pf));
        f.set(pf,"No you are Not");
        System.out.println(pf);
    }
}
