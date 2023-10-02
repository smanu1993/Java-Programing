package interview;

public class DeleteCharFromString {
    public static void main(String[] args) {
        String str = "hello####world";
        System.out.println(str);
        char ch = '#';
        System.out.println("remove "+ch+" from "+str);
        System.out.println(deleteChar(str,ch));
        removeCharFromStr(str,ch);
    }
    public static String deleteChar(String str, Character ch){
        char [] arr = str.toCharArray();
        String res = "";
        for (char c : arr){
            if (c != ch){
                res = res.concat(String.valueOf(c));
            }
        }
       return res;
    }
    public static void removeCharFromStr(String str, char ch){
        System.out.println(str+" -->"+str.length());
        String res = str.replace(String.valueOf(ch),"");
        System.out.println(res+" -->"+res.length());
    }
}


