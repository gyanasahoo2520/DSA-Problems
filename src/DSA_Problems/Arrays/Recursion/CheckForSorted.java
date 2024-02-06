package DSA_Problems.Arrays.Recursion;

public class CheckForSorted {
    public static void main(String[] args) {
        int[] arr={1,4,6,8};
        System.out.println(isSort(arr,0));
    }
    static boolean isSort(int[] arr, int index){
        //base condition
        if(index == arr.length-1){
            return  true;
        }
        return arr[index]<arr[index+1] && isSort(arr,index+1);
    }
}
