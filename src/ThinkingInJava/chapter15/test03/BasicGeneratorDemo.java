package ThinkingInJava.chapter15.test03;

import ThinkingInJava.example.Generator;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-31
 * Time: 上午12:14
 * To change this template use File | Settings | File Templates.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator <CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for(int i = 0;i<5;i++){
            System.out.println(gen.next());
        }
    }
}
