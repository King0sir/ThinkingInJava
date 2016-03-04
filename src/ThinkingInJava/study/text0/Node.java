package ThinkingInJava.study.text0;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-3
 * Time: 下午12:12
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private int id ;
    private String data;
    private Node next;

    public Node(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public Node(int id, String data, Node next) {
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
