package interview;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInString {
    public static void main(String[] args) {
        String str = "the test concept is new the concept for this year";
        String [] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : arr){
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else {
                map.put(word,1);
            }
        }
        for (Map.Entry entry : map.entrySet()){

            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
}
