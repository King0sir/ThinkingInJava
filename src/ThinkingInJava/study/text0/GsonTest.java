package ThinkingInJava.study.text0;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-10
 * Time: 上午11:18
 * To change this template use File | Settings | File Templates.
 */
public class GsonTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Node n00 = new Node("00");
        Node node1 = new Node(1,"a",n00);
        Node node2 = new Node(2,"b",n00);
        List<Node> nodes = new LinkedList<Node>();

        nodes.add(n00);
        nodes.add(node1);
        nodes.add(node2);

        String nodesString = gson.toJson(nodes);
        System.out.println(nodesString);

        List<Node> nodess = gson.fromJson(nodesString,new TypeToken<List<Node>>(){}.getType());
        System.out.println(nodess);
    }
}
