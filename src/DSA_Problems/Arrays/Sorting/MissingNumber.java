package DSA_Problems.Arrays.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={4,0,1,2};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
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
            if(arr[j] != j){
                return j;
            }
        }
        //case 2
        return arr.length;
    }
}
