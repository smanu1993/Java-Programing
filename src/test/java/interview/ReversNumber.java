package interview;

public class ReversNumber {
    public static void main(String[] args) {
        int num = 1234567;
        reverseNumber(num);
    }

    public static void reverseNumber(int num){
        System.out.println("number = "+num);
        int res = 0;
        while (num>0){
            int rem = num%10;
            res = res*10 + rem;
            num = num/10;
        }
        System.out.println("reversed num = "+res);
    }
}
