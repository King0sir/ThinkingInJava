package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-18
 * Time: 上午10:52
 * To change this template use File | Settings | File Templates.
 */
public class IntSuper {
    public static void main(String[] args){
        int i=0;
        while(true){
            if(i+1<i){
                System.out.println(i);
                break;
            }
            if(i%1000==0){
                System.out.println(i);
            }
            i++;
        }
    }

}
