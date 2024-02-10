package DSA_Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeBySign {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,1,-2,-5,2,-4));
        reArrangeBySign2(arr);
    }
    // Type 1: The array contain same no. of positive and negative element
    static void reArrangeBySign(ArrayList<Integer> arr){
        int n=arr.size();
        ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex=0,negIndex=1;
        for(int i=0;i<n;i++){
            if(arr.get(i) < 0){
                ans.set(negIndex,arr.get(i));
                negIndex+=2;
            }else{
                ans.set(posIndex,arr.get(i));
                posIndex+=2;
            }
        }
        System.out.println(ans);
    }

    //Type 2: the array contain different number of positive and negative element
    static void reArrangeBySign2(ArrayList<Integer> arr){
        int n=arr.size();

        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr.get(i)>0)
                pos.add(arr.get(i));
            else
                neg.add(arr.get(i));
        }
        if(pos.size() < neg.size()){
            for(int i=0;i<pos.size();i++){
                arr.set(2*i,pos.get(i));
                arr.set(2 * i + 1,neg.get(i));

            }
            int index=pos.size()*2;
            for(int i=pos.size();i<neg.size();i++){
                arr.set(index,neg.get(i));
                index++;
            }
        }else{
            for(int i=0;i<neg.size();i++){
                arr.set(2*i,pos.get(i));
                arr.set(2 * i + 1,neg.get(i));

            }
            int index=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                arr.set(index,pos.get(i));
                index++;
            }
        }

        System.out.println(arr);
    }
}
