package interview;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharFromString {
    public static void main(String[] args) {
        String input = "vsdkwweerrk";
        char [] arr = input.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (int i=0; i<input.length();i++){
            if (map.get(input.charAt(i))>1){
                System.out.println(input.charAt(i));
                break;
            }

        }
    }
}
