package interview;

public class ShiftZerosToBiginingOArray {
    public static void main(String[] args) {
        int[] arr = {3,4,9,0,7,0,8,9,0};
        for (int i : arr){
            System.out.print(i);
        }
        inTheBeginning(arr);
        System.out.println();
        for (int i : arr){
            System.out.print(i);
        }
    }
    static void inTheBeginning(int[] array){
        int startIndex=0;
        int i,temp,j;
        for(i=1; i<array.length; i++){
            if(array[i] == 0){
                for(j=i; j>startIndex;j--){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                startIndex++;
            }
        }
    }
}
