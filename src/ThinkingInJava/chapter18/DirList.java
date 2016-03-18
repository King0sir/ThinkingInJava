package ThinkingInJava.chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-18
 * Time: 下午2:02
 * To change this template use File | Settings | File Templates.
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list ;
        if(args.length == 0){
            list = path.list();
        }else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem:list){
            System.out.println(dirItem);
        }
    }
}
class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }
    public boolean accept(File dir , String name){
        return pattern.matcher(name).matches();
    }
}
