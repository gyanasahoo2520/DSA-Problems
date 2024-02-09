package DSA_Problems.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,3,2,3,1,2,2};
        System.out.println(majorityElement2(arr));
    }

    static int majorityElement(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> num=new HashMap<>();
        for(int i=0;i<n;i++){
            int count=num.getOrDefault(arr[i],0);
            num.put(arr[i],count+1);
        }
        for(Map.Entry<Integer,Integer> it : num.entrySet()){
            if(it.getValue() > (n/2))
                return it.getKey();
        }
        return -1;
    }
    static int majorityElement2(int[] arr){
        int n=arr.length;
        int count=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=arr[i];
            }else if(el==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        // If in question given that every array should contain a majority element then no need to check for majority
        //Direct return the element i.e. 'el'

        //Checking if sorted element is majority element or not
        int count1=0;
        for (int j : arr) {
            if (j == el)
                count1++;
        }
        if(count1 > (n/2))
            return el;
        return -1;
    }
}
