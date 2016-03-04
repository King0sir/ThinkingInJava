package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-15
 * Time: 下午4:58
 * To change this template use File | Settings | File Templates.
 */
public class StringAna {
    public static void main(String[] args){
        String a = "/home/action/sss";
        int n =a.indexOf("/",1);
        System.out.println(a.indexOf("/",0));
        System.out.println(a.indexOf("/",1));
        System.out.println(a.indexOf("/",7));
        System.out.println(a.substring(0,a.indexOf("/",1)));
        String phone0 = "18641001579";
        String phone = phone0.substring(0,3)+"****"+phone0.substring(7,11);
         System.out.println(phone);

        StringAna s = new StringAna();
        Long amt = 4560456405l;
        System.out.println(String.valueOf(amt/10000.0));

        String ss = "32165454.12";
        System.out.println(s.accountUpChange(ss));

        StringBuilder  ssb = new StringBuilder();
        ssb.append(ss);
        ssb.reverse();                                                //StringBuilder的操作会直接改变原有的StringBuilder，而不会产生新的引用。
        System.out.println(ssb.toString());

        char[] c = new char[ss.length()];
        ss.getChars(0,ss.length(),c,0);
        System.out.println(c);
       System.out.println(ss.getBytes());



    }

    private String accountTypeChange(Long amta){
        String amt = String.valueOf(amta);
        String intPart = amt.substring(0,amt.length()-2);
        String decimalPart = amt.substring(amt.length()-2);
        return intPart+"."+decimalPart;
    }
    private String accountUpChange(String amt){
        int index = amt.indexOf('.');
        return amt.substring(0,index)+amt.substring(index+1);
    }
}
