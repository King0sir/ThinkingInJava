package ThinkingInJava.chapter15.test04;

import ThinkingInJava.chapter15.test02.Generator;
import ThinkingInJava.chapter15.test03.Generators;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-2-2
 * Time: 下午1:48
 * To change this template use File | Settings | File Templates.
 */
class Customer{
    private static long counter = 1;
    private final long id = counter++;
    private Customer(){}
    public String toString(){return "Customer: " +id;}
    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }
}
class Teller{
    private static long counter = 1;
    private final long id = counter++;
    private Teller(){}
    public String toString(){return "Teller: " +id;}
    public static Generator<Teller> generator(){
        return new Generator<Teller>() {
            public Teller next() {
                return new Teller();
            }
        };
    }
}
public class BankTeller {
    public static void serve(Teller t,Customer c){
        System.out.println(t+" serves "+c);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line,Customer.generator(),15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers,Teller.generator(),4);
        for(Customer c : line){
            serve(tellers.get(random.nextInt(tellers.size())),c);
        }
    }
}
