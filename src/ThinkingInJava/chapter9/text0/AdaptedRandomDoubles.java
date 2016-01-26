package ThinkingInJava.chapter9.text0;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 下午8:36
 * To change this template use File | Settings | File Templates.
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable{
    private int count;
    public AdaptedRandomDoubles(int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        if(count--==0){
            return -1;
        }
        String result = Double.toString(next())+" ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while(s.hasNextDouble()){
            System.out.println(s.nextDouble()+" ");

        }
    }
}
