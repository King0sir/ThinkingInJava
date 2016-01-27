package ThinkingInJava.chapter12.text01;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:47
 * To change this template use File | Settings | File Templates.
 */
public class Cleanup {
    public static void main(String[] args){
        try{
            InputFile in = new InputFile("Cleanup.java");
            try{
                String s ;
                int i =1;
                while((s=in.getLine())!=null){
                    ;
                }
            }catch (Exception e){
                System.out.println("catch Exception in main");
                e.printStackTrace();
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("input file construction failed");
        }
    }
}
