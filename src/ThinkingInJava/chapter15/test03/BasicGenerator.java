package ThinkingInJava.chapter15.test03;

import ThinkingInJava.example.Generator;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-31
 * Time: 上午12:05
 * To change this template use File | Settings | File Templates.
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type){this.type = type;}
    public T next(){
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
