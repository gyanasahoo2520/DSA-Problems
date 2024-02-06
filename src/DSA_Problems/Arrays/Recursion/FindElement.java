package DSA_Problems.Arrays.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] arr={2,18,5,5,12};
        int target=5;
//        System.out.println(find(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
//        System.out.println(findIndexLast(arr,target,arr.length-1));
//        findAllIndex(arr,target,0);
//        System.out.println(list);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=findAllIndex1(arr,target,0,list);
        System.out.println(ans);
        System.out.println(list);
    }
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target,int index) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr,target,index+1);
        }
    }
    static int findIndexLast(int[] arr, int target, int index) {
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndexLast(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target,int index) {
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndex1(int[] arr, int target,int index,ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex1(arr,target,index+1,list);
    }
}
