package interview;

public class ShortSting {
    public static void main(String[] args) {
        int[] num = {1,0,0,0,1,1,1,0,0,1,1,1};
        System.out.println("length = "+ num.length);
        System.out.print("before sorting = ");
        for (int i : num){
            System.out.print(i);
        }
        for (int i = 0; i <num.length ; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] < num[j]) {
                   int temp = num[i];
                   num[i] =num[j];
                   num[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("length = "+ num.length);
        System.out.println("After sorting = ");
        for (int i : num){
            System.out.print(i);
        }
    }
}
