package DSA_Problems.StackDS;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];
        int n=arr.length;
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,6,8,2,3,7};
        int[] ans=nextGreater(arr);
        System.out.println(Arrays.toString(ans));
    }
}
