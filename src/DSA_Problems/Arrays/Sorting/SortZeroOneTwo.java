package DSA_Problems.Arrays.Sorting;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,2,1,2,0,0,0};
        int n=arr.length;
        sortArray(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArray(int[] arr,int n){
        int low=0,mid=0,high=n-1;
        while (mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }

    // OR Bruteforce method
    static void sortArray2(int a[],int n){
        int cnt0=0,cnt1=0,cnt2=0;

        for(int i=0;i<n;i++){
            if(a[i]==0) cnt0++;
            else if(a[i]==1) cnt1++;
            else if(a[i]==2) cnt2++;
        }
        int k=0;
        for(int i=0;i<cnt0;i++){
            a[k]=0;
            k++;
        }
        for(int i=0;i<cnt1;i++){
            a[k]=1;
            k++;
        }
        for(int i=0;i<cnt2;i++){
            a[k]=2;
            k++;
        }
    }
}
