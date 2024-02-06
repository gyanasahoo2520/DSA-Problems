package DSA_Problems.Arrays.Recursion;

public class RotateBS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        int target=5;
        System.out.println(searchTarget(arr,target,0,arr.length-1));
    }

    private static int searchTarget(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return searchTarget(arr,target,s,m-1);
            }else {
                return searchTarget(arr,target,m+1,e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return searchTarget(arr,target,m+1,e);
        }else{
            return searchTarget(arr,target,s,m-1);
        }
    }
}
