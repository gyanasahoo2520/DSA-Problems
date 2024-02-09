package DSA_Problems.Arrays.Sorting;

import java.util.ArrayList;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,3,4,5,6};
        int[] arr2={2,3,3,5,6,6,7};
        ArrayList<Integer> ans=intersectionOfArray(arr1,arr2);
        System.out.println(ans);

    }

    static ArrayList<Integer> intersectionOfArray(int[] A, int[] B) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                i++;
            }else if(B[j]<A[i]){
                j++;
            }else{
                ans.add(A[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
