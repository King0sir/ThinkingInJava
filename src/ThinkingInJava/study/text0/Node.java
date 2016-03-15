package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-3
 * Time: 下午12:12
 * To change this template use File | Settings | File Templates.
 */
public class Node extends N {
    private int id ;
    private String data;
    private Node next;

    public Node(String code) {
        super(code);
    }

    public Node(int id, String data) {
        super("1");
        this.id = id;
        this.data = data;
    }

    public Node(int id, String data, Node next) {
        super("2");
        this.id = id;
        this.data = data;
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
