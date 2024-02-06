package DSA_Problems.Arrays.Recursion;

public class ReduceNumToZero {
    static int countSteps(int n){
        return helper(n,0);
    }
    static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2 == 0){
            return helper(n/2,steps+1);
        }else{
            return helper(n-1,steps+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(countSteps(41));
    }
}
