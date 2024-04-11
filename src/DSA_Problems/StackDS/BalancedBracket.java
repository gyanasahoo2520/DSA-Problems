package DSA_Problems.StackDS;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static boolean isBalanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
