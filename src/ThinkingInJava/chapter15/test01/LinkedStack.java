package ThinkingInJava.chapter15.test01;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-29
 * Time: 上午12:08
 * To change this template use File | Settings | File Templates.
 */
public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        Node() {item = null;next = null;}
        Node(U item,Node<U> next){
            this.next =next;
            this.item = item;
        }
        boolean end(){return item == null && next == null;}
    }
    private Node<T> top = new Node <T>();
    public void push(T item){
        top = new Node<T>(item,top);
    }
    public T pop(){
        T res = top.item;
        if(!top.end()){
            top = top.next;
        }
        return res;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s : "Phase on stun!".split(" ")){
            lss.push(s);
        }
        String s;
        while((s = lss.pop())!=null){
            System.out.println(s);
        }
    }
}
