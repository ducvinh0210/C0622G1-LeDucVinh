package ss12_java_collection_framework.exercise.count_the_number_of_words_in_the_string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Map;
import java.util.TreeMap;

public class CountTheNumberOfWordsInTheString {
    public static void main(String[] args) {
        String str = "le le Duc vinh vinh lop c0622g1 ";
        String[] string = str.toLowerCase().split(" ");
        Map<String, Integer> treeMap = new TreeMap<>();
        for(String key: string){
            if(!treeMap.containsKey(key)){
                treeMap.put(key,1);
            }else{
                Integer value= treeMap.get(key);
                value++;
                treeMap.replace(key,value);
            }
        }
        System.out.println(treeMap);
    }
}
