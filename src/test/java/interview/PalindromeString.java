package interview;

public class PalindromeString {
    public static void main(String[] args) {
       String str = "adaba" ;
       isPalindrome(str);

    }
    public static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2+1 ; i++) {
            if (arr[i]==arr[arr.length-i-1]){
                if ( i == arr.length/2) {
                    System.out.println(str + " is palindrome");
                    return true;
                }
            }else {
                System.out.println(str+ " is not palindrome");
                break;
            }
        }
        return false;
    }
}
