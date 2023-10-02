package interview;

public class ReverseStringPreserveSpace {
    public static void main(String[] args) {
        String str = "java is a programming language";
        reverseStrPreserveSpace(str);
    }
    public static void reverseStrPreserveSpace(String str){
        System.out.println(str);
        char [] arr = str.toCharArray();
        String revStr = "";
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] !=' '){
               revStr = revStr.concat(String.valueOf(arr[i]));
            }
        }
        System.out.println(revStr);
        String[] strArr = str.split(" ");
        String res = "";
        int sIndex =0;
        int eIndex =0;
        for (String s : strArr) {
            eIndex = eIndex + s.length();
            res = res.concat(revStr.substring(sIndex,eIndex)) + " ";
            sIndex = eIndex;
        }
        System.out.println(res);
    }
}
