package DSA_Problems.Arrays.Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={2,1,4,2,6,5};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }
    static int[] setMismatch(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        //search for first missing number
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
