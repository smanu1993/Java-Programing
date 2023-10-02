package interview;

public class SumOfNumClosestTOANum {
    public static void main(String[] args) {
        int [] numarr = {-40,10,4, 5, 10, -9, -2};
        int preDiff = 100;
        int currDiff = 0;
        int refernce =10;
        int index1 =0;
        int index2 = 0;
        int sum = 0;
        for (int i = 0; i <numarr.length ; i++) {
            System.out.print(numarr[i]+",");
            for (int j = i+1; j < numarr.length; j++) {
               sum =  Math.addExact(numarr[i], numarr[j]);
                currDiff = Math.abs(refernce-sum);
                if (currDiff < preDiff){
                    preDiff = currDiff;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println();
        sum = Math.addExact(numarr[index1],numarr[index2]);
        System.out.println("sum = "+sum+" index1 = "+index1+" and index2 = "+index2);
    }
}
