package demo1;

import java.util.LinkedHashMap;
import java.util.Map;

public class okk {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 2);
        map.put("D", 5);

        for (String x : map.keySet()) {
            System.out.println("ong " + x + " di tre " + map.get(x) + " lan!");
        }
    }


}
