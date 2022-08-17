package ss12_java_collection_framework.practince.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {
    public static void main(String[] args) {
        Map<Integer,String> stringMap= new HashMap<>();
        stringMap.put(1,"Thi Vi");
        stringMap.put(2,"Duc Vinh");
        stringMap.put(3,"Thi Van");
        stringMap.put(2,"Duc Vinh 2");
//        System.out.println(stringMap.get(1));
//        System.out.println(stringMap.get(2));
//        System.out.println(stringMap.get(3));


        Set<Integer> integerSet= stringMap.keySet();
        for(Integer item : integerSet){
            System.out.printf("%s-%s\n",item,stringMap.get(item));
        }
// duyet theo enty
        for (Map.Entry<Integer,String> entry : stringMap.entrySet()){
            System.out.printf("%s-%s\n",entry.getKey(),entry.getValue());
        }






    }

}
