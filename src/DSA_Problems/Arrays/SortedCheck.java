package DSA_Problems.Arrays;
// Check if array is sorted or not
public class SortedCheck {
    static boolean checkSorted(int[] arr,int n){
        boolean k=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
            }
            else{
                k=false;
            }
            k=true;
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        boolean check=checkSorted(arr,n);
        System.out.println(check);
    }
}
