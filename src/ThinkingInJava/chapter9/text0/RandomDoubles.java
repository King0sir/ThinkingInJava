package ThinkingInJava.chapter9.text0;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 下午8:34
 * To change this template use File | Settings | File Templates.
 */
public class RandomDoubles {
    private static Random rand = new Random(37);
    public double next(){return rand.nextDouble();}
    public static void main(String[] args){
        RandomDoubles r = new RandomDoubles();
        for(int i=0;i<7;i++){
            System.out.println(r.next()+"\t");
        }
    }
}
