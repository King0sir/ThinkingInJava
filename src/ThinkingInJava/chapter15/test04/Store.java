package ThinkingInJava.chapter15.test04;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-3
 * Time: 下午6:57
 * To change this template use File | Settings | File Templates.
 */
class Product{
    private final int id;
    private String description;
    private double price;
    public Product(int iDnumber,String descr,double price){
        id = iDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }
    public String toString(){
        return id +": "+description+" , price: $"+price;
    }
}

public class Store {

}
