package ThinkingInJava.chapter12.text01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-17
 * Time: 下午8:37
 * To change this template use File | Settings | File Templates.
 */

public class InputFile {
    private BufferedReader in;
    public InputFile(String fname)throws Exception{
        try{
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            System.out.println("cannot open"+fname);
            throw e;
        }catch (Exception e){
            try{
                in.close();
            }catch (IOException e2){
                System.out.println("close fail");
            }
            throw e;
        }finally{

        }
    }
    public String getLine(){
        String s;
        try{
            s = in.readLine();
        }catch (IOException e){
            throw new RuntimeException(" readline fail");
        }
        return s;
    }
    public void dispose(){
        try{
            in.close();
            System.out.println("dispose succ");
        }catch (IOException e){
            throw new RuntimeException("inclose fail");
        }
    }
}
