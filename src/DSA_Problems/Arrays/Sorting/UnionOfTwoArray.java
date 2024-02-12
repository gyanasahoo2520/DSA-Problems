package DSA_Problems.Arrays.Sorting;

import java.util.ArrayList;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m=arr1.length;
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n=arr2.length;
        ArrayList<Integer> ans=findUnion(arr1,arr2,m,n);
        System.out.println(ans);
    }
    static ArrayList<Integer> findUnion(int[] arr1,int[] arr2,int m,int n){
        int i=0,j=0;
        ArrayList<Integer> union=new ArrayList<>();
        while(i<m && j<n) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
            while(i<m){
                if(union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            while(j<n){
                if(union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        return union;
    }
}
