package ThinkingInJava.chapter9.text0;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-3
 * Time: 下午8:50
 * To change this template use File | Settings | File Templates.
 */
public interface RandVals {
    Random rand = new Random(12);
    int rand_int = rand.nextInt();
    long rand_long = rand.nextLong()*10;
    float rand_float = rand.nextFloat()*10;
    double rand_double = rand.nextDouble()*10;

}
