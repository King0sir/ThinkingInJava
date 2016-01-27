package ThinkingInJava.chapter13.test01;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-30
 * Time: 上午11:23
 * To change this template use File | Settings | File Templates.
 */
public class UsingStringBuilder {
    public static Random rand = new Random();
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for(int i=0;i<25;i++){
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2,result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}

