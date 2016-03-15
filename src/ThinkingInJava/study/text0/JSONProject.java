package ThinkingInJava.study.text0;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 16-3-9
 * Time: 下午2:23
 * To change this template use File | Settings | File Templates.
 */
public class JSONProject {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        Map map = new HashMap();
        map.put(1,2);
        map.put(2,4);
        map.put(3,6);
        map.put(4,8);
        map.put(5,10);

        Node node1 = new Node(1,"a");
        Node node2 = new Node(2,"b",node1);

        jsonObject.putAll(map);
        jsonObject.put("node1", node1);
        jsonObject.put("node2",node2);
        System.out.println(jsonObject);

        JSONArray jsonArray = JSONArray.fromObject(jsonObject);
        List<Map<?, ?>> list = new ArrayList<Map<?,?>>();
        Iterator<JSONObject> it = jsonArray.iterator();
        while(it.hasNext()){
            JSONObject json2 = it.next();
            list.add(parseJSON2MapString(json2.toString()));
        }

        System.out.println(list);


    }
    public static Map<?, ?> parseJSON2MapString(String jsonStr){
        Map<Object, Object> map = new HashMap<Object, Object>();
        //最外层解析
        JSONObject json = JSONObject.fromObject(jsonStr);
        for(Object k : json.keySet()){
            Object v = json.get(k);
            if(null!=v){
                map.put(k, v);
            }
        }
        return map;
    }
}
