package DSA_Problems.Arrays;

import java.util.Arrays;

// Remove Duplicate element from the sorted array
public class RemoveDuplicate {
    static int duplicate(int[] a,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(a[i] != a[j]){
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={7,7,5,3,2,5};
        int n=arr.length;
        Arrays.sort(arr);
        int count=duplicate(arr,n);
        System.out.println("Number of duplicate element : "+(n-count));
        System.out.println("After removing the duplicate element : ");
        for(int i=0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
