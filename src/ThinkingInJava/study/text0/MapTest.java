package ThinkingInJava.study.text0;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ipaynow
 * Date: 15-12-30
 * Time: 上午10:26
 * To change this template use File | Settings | File Templates.
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        System.out.println(map);

        Map<String , Object> mmm = new HashMap<String, Object>();
        mmm.put("balance",new BigDecimal(1513645l));
        System.out.println(mmm);
    }
}
