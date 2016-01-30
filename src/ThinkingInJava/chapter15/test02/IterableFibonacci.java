package ThinkingInJava.chapter15.test02;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午12:44
 * To change this template use File | Settings | File Templates.
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;
    public IterableFibonacci(int count){n = count;}
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            public boolean hasNext(){return n>0;}
            public Integer next(){
                n--;
                return IterableFibonacci.this.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i:new IterableFibonacci(18)){
            System.out.print(i+" ");
        }
    }
}
