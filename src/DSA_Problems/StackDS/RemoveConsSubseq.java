package DSA_Problems.StackDS;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsSubseq {
    public static int[] removeSubseq(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int[] res=new int[st.size()];
        int m=st.size();
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] ans=removeSubseq(arr);
        System.out.println(Arrays.toString(ans));
    }
}
