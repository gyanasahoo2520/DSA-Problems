package DSA_Problems.Arrays.Recursion;

public class CountZeros {
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        else{
            return helper(n/10,c);
        }
    }
    public static void main(String[] args) {
        System.out.println(count(5004));
    }
}
