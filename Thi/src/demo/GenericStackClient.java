package demo;

import java.util.HashMap;
import java.util.Set;

public class GenericStackClient {
    public static void main(String[] args) {
        HashMap<String, Integer> customers= new HashMap<>();
        customers.put("John",30);
        customers.put("Mike",12);
        customers.put("Vinh",24);
        customers.put("Vi",22);
        Set<String> keys= customers.keySet();
        for (String key:keys
             ) {
            System.out.println("key:"+key+","+ customers.get(key));
            
        }

    }


}
