package DSA_Problems.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,4,5};
        System.out.println("The Missing Number is : " + missingNum2(arr,n));
    }

    static int missingNum1(int[] arr, int n) {
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2 ^ arr[i];
            xor1=xor1 ^ (i+1);
        }
        xor1=xor1 ^ n;
        return (xor1 ^ xor2);
    }
    static int missingNum2(int[] arr,int n){
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<n-1;i++)
            s2+=arr[i];
        return sum-s2;
    }
}
