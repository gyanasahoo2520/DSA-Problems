package DSA_Problems.Arrays.Hashing;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();

        //Union
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        System.out.println("Union = "+set);

        //Intersection
        set.clear();
        for(int i:arr1){
            set.add(i);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set1.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.print("Intersection = " + set1);
    }
}
