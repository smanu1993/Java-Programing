package interview;

public class FindClosestNumToGivenNumFromArray {
    public static void main(String[] args) {
        int num = 50;
        int[] arr = {13,46,37,61,50,70};
        findClosestNum(num, arr);
    }
    public static void findClosestNum(int num, int[] arr){
        System.out.println("reference number = "+num);
        int max = 0;
        System.out.print("arr = ");
        for (int n : arr){
            if (n > max){
                max = n;
            }
            System.out.print(n+",");
        }
        System.out.println();
        int res = 0;
        int preDiff = max;
        int currDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            currDiff = num - arr[i];
            if(currDiff <0){
                currDiff = -(currDiff);
            }
            if (currDiff < preDiff){
                preDiff = currDiff;
                res = arr[i];
            }
        }
        System.out.println("result = "+ res);
    }
}
