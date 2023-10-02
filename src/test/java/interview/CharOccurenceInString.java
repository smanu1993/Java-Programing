package interview;

import java.util.HashMap;
import java.util.Map;

public class CharOccurenceInString {
    public static void main(String[] args) {
        String str = "java is programing language";
        System.out.println(str);
        charOccurenceInString(str);
    }

    public static void charOccurenceInString(String str){
        char [] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                if (c != ' '){
                    map.put(c, 1);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+" -->"+ entry.getValue());
        }
    }
}
