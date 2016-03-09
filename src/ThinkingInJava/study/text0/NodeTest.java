package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-3
 * Time: 下午12:13
 * To change this template use File | Settings | File Templates.
 */
public class NodeTest {
    public static void main(String[] args) {
        N n = new N("2b");
        Node n1 = new Node(1,"a");
        Node n2 = new Node(2,"b",n1);
        System.out.println(n1);
        System.out.println(n2);


    }
}
