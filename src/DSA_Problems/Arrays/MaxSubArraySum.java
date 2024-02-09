package DSA_Problems.Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int ans=maxSubarraySum(arr);
        System.out.println(ans);
        printMaxSubarray(arr);
    }

    private static int maxSubarraySum(int[] arr) {
        int n=arr.length;
        int sum=0,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum > maxi)
                maxi=sum;
            if(sum < 0)
                sum=0;
        }
        return maxi;
    }
    // for printing the subarray that gives maximum sum
    static void printMaxSubarray(int[] arr){
        int n=arr.length;
        int sum=0,maxi=Integer.MIN_VALUE;
        int ansStart=-1,ansEnd=-1;
        int start=0;
        for(int i=0;i<n;i++){
            if(sum==0)
                start=i;
            sum+=arr[i];
            if(sum > maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum < 0)
                sum=0;
        }
        System.out.println("The Sub_Array is : ");
        for (int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
