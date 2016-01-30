package ThinkingInJava.chapter15.test02;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午12:26
 * To change this template use File | Settings | File Templates.
 */
public class Fibonacci implements Generator<Integer>{
    private int count = 0;
    public Integer next(){return fib(count++);}
    private int fib(int n){
        if(n<2){return 1;}
        return fib(n-2)+fib(n-1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for(int i = 0; i<18;i++){
            System.out.println(gen.next()+" ");
        }
    }
}
